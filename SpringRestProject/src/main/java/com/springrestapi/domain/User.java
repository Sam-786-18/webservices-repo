package com.springrestapi.domain;

import java.io.Serializable;

public class User implements Serializable{
private Integer userId;
private String uName,email;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
