package com.formparam.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class User {
private long userId;
private String userName;
private String email;
@XmlAttribute
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
@XmlElement
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@XmlElement
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}




}
