package com.nt.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
private Integer prodId;
private String prodName;
private String prodPrice;
public Integer getProdId() {
	return prodId;
}
public void setProdId(Integer prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public String getProdPrice() {
	return prodPrice;
}
public void setProdPrice(String prodPrice) {
	this.prodPrice = prodPrice;
}

}
