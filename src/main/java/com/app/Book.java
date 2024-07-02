package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int bid;
	private String bookName;
	private String bookPublication;
	private float price;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublication() {
		return bookPublication;
	}
	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", bookPublication=" + bookPublication + ", price="
				+ price + "]";
	}
	
	
	
}
