package com.cg.feedback.authentication.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="UserDataBase")
public class User {
	@Id
	@Column(name="userId")
    private Long userId;
	
	@Column(name="userName", nullable = false)
	private String userName;
	
	@Column(name="user_password", nullable = false)
    private String password;

	@Enumerated(EnumType.STRING)
    @Column(name="role")
    private ERole role;
    
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
}
