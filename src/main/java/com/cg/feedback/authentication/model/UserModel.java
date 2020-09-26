package com.cg.feedback.authentication.model;

import com.cg.feedback.authentication.entity.ERole;

public class UserModel {
    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}


	private Long userId;

    private String userName;

    private String password;


    private ERole role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
	}


}
