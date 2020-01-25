package com.formparam.domain;

import javax.ws.rs.QueryParam;

public class User {
//@QueryParam("userId")
private String userId;
//@QueryParam("userName")
private String userName;
//@QueryParam("email")
private String email;
//@QueryParam("mobile")
private String mobile;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}



}
