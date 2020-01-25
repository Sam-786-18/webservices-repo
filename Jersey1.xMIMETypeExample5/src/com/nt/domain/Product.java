package com.nt.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="product")
public class Product implements Serializable {
private int pid;
private String pname;
private double price;
@XmlAttribute(name="pid")
public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}
@XmlElement
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@XmlElement
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
