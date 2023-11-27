package com.example.post.Repository;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Member {
	
	
	private String userId;
	private String userPassword;
	private String userName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate insertDate;
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(LocalDate insertDate) {
		this.insertDate = insertDate;
	}

}
