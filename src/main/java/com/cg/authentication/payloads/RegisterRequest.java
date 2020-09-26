package com.cg.authentication.payloads;

import javax.validation.constraints.NotEmpty;

import com.cg.feedback.authentication.entity.ERole;

public class RegisterRequest {
	@NotEmpty(message = "userId cannot be blank")
    Long userId;

    @NotEmpty(message = "Username cannot be blank")
    private String userName;

    @NotEmpty(message = "Password cannot be blank")
    private String password;

    private ERole role;

    public RegisterRequest() {
    	super();
    }


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


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public ERole getRole() {
		return role;
	}


	public void setRole(ERole role) {
		this.role = role;
	}

}
