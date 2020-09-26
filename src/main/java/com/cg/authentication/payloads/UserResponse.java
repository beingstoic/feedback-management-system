package com.cg.authentication.payloads;

import java.util.List;

import com.cg.feedback.authentication.entity.ERole;

public class UserResponse {

	private int userId;

	private String userName;

	private String token;

	private String type = "Bearer";

	private ERole role;

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
	}

	public UserResponse() {
		super();
	}

	public UserResponse(int userId, String username, String token,
                        ERole roles) {
		super();
		this.userId = userId;
		this.userName = username;
		this.token = token;
		this.role = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
