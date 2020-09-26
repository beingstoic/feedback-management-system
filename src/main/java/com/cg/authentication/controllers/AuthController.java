package com.cg.authentication.controllers;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cg.feedback.authentication.entity.ERole;
import com.cg.feedback.authentication.exception.UserExistsException;
import com.cg.feedback.authentication.exception.UserNotFoundException;
import com.cg.feedback.authentication.model.UserModel;
import com.cg.feedback.authentication.service.AuthService;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<UserModel> login(@RequestBody UserModel mUser) throws UserNotFoundException  {
        UserModel user = authService.login(mUser);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody UserModel mUser) throws UserExistsException {
        UserModel user = authService.register(mUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }
    
    @GetMapping("/fetchuser")
    public ResponseEntity<List<UserModel>> fetchUsers(@RequestParam ERole roles){
		List<UserModel> userList = authService.fetchUsers(roles);
    	return new ResponseEntity<>(userList, HttpStatus.OK);
    	
    }
}
