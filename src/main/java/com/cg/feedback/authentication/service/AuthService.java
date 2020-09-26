package com.cg.feedback.authentication.service;

import java.util.List;

import com.cg.feedback.authentication.entity.ERole;
import com.cg.feedback.authentication.exception.UserExistsException;
import com.cg.feedback.authentication.exception.UserNotFoundException;
import com.cg.feedback.authentication.model.UserModel;

public interface AuthService {

    public UserModel login(UserModel mUser) throws UserNotFoundException;
  
    public UserModel register(UserModel user) throws UserExistsException;

    public String updatePassword(String email, String newPassword) throws UserNotFoundException;
    
    public List<UserModel> fetchUsers(ERole roles);
 
}
