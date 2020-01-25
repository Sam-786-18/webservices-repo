package com.jerseyutil.domain;

import java.io.Serializable;

/**
 * @author Lenovo
 *
 */
public class ResponseDTO implements Serializable {
 private  byte status;
 private String message;
 private String data;
 
public byte getStatus() {
	return status;
}
public void setStatus(byte status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getData() {
	return data;
}
public void setData(String string) {
	this.data = string;
}
@Override
public String toString() {
	return "ResponseDTO [status=" + status + ", message=" + message + ", data=" + data + "]";
}

}
