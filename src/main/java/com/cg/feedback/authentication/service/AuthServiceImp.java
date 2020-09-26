package com.cg.feedback.authentication.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.feedback.authentication.entity.ERole;
import com.cg.feedback.authentication.entity.User;
import com.cg.feedback.authentication.exception.UserExistsException;
import com.cg.feedback.authentication.exception.UserNotFoundException;
import com.cg.feedback.authentication.model.UserModel;
import com.cg.feedback.authentication.repository.AuthRepository;

@Service
public class AuthServiceImp implements AuthService {

    @Autowired
    private AuthRepository authRepo;

    
    public User convert(UserModel source) {
		User eUser = null;
		if(source!=null) {
			eUser = new User();
			eUser.setUserId(source.getUserId());
			eUser.setUserName(source.getUserName());
			eUser.setPassword(eUser.getPassword());
			eUser.setRole(eUser.getRole());
		}
    	return eUser;
    	
    }
    
    public UserModel convert(User source) {
		UserModel eUser = null;
		if(source!=null) {
			eUser = new UserModel();
			eUser.setUserId(source.getUserId());
			eUser.setUserName(source.getUserName());
			eUser.setPassword(source.getPassword());
			eUser.setRole(source.getRole());
		}
    	return eUser;
    	
    }
    
	@Override
	public String updatePassword(String username, String newPassword) throws UserNotFoundException {
		User mUser = authRepo.findByUserName(username);
		if(mUser==null) {
		return "No user associated with this username";
		}
		return "User Updated Successfully";
	}

	

	@Override
	public UserModel register(UserModel user) throws UserExistsException {
		return convert(authRepo.save(convert(user)));
	}

	@Override
	public List<UserModel> fetchUsers(ERole roles) {
		/*
		 * List<UserModel> modelList=null; List<User>
		 * entityList=authRepo.findUserByRoles(roles); if(entityList!=null) {
		 * modelList=entityList.stream().map(p ->
		 * convert(p)).collect(Collectors.toList());
		 * 
		 * } return modelList;
		 */
		return null;
	}

	@Override
	public UserModel login(UserModel mUser) throws UserNotFoundException {
		User user = (authRepo.login(mUser.getUserName(), mUser.getPassword(), mUser.getRole()));
		if(user==null) {
			return null;
		}
		return convert(user);
	}
	
	
   
}
