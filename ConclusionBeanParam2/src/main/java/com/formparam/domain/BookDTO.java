package com.formparam.domain;

import javax.ws.rs.PathParam;

public class BookDTO {
	@PathParam("isbn")
	private Integer isbn;
	@PathParam("title")
	private String title;
	@PathParam("price")
	private Double price;

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
