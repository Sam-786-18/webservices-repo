package com.formparam.exception;

public class UserNotFoundException extends RuntimeException {
public UserNotFoundException() {
	super();
}

public UserNotFoundException(String message) {
	super(message);
	
}
public UserNotFoundException(String message, Exception e) {
	super(message,e);
	
}
}
