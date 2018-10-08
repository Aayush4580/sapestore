package com.sapient.sapestore.model;

import java.sql.Timestamp;
import java.util.List;

public class Books {

	public Books() {
		super();
	}

	private Integer iSBN;
	private String title;
	private Integer quantity;
	private String book_img;
	private double price;

	private String short_desc;
	private String long_desc;

	private Timestamp updated_date;
	private Timestamp date;
	private boolean active;
	private String publisher;
	private String author;

	private String category;
	private String language;

	private List<Book_Rating_Comments> commentsList;

	private double avgRating;

	public Integer getiSBN() {
		return iSBN;
	}

	public void setiSBN(Integer iSBN) {
		this.iSBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getBook_img() {
		return book_img;
	}

	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	public String getLong_desc() {
		return long_desc;
	}

	public void setLong_desc(String long_desc) {
		this.long_desc = long_desc;
	}

	public Timestamp getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Book_Rating_Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Book_Rating_Comments> commentsList) {
		this.commentsList = commentsList;
	}

	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public Books(Integer iSBN, String title, Integer quantity, String book_img, double price, String short_desc,
			String long_desc, Timestamp updated_date, Timestamp date, boolean active, String publisher, String author,
			String category, String language, List<Book_Rating_Comments> commentsList, double avgRating) {
		super();
		this.iSBN = iSBN;
		this.title = title;
		this.quantity = quantity;
		this.book_img = book_img;
		this.price = price;
		this.short_desc = short_desc;
		this.long_desc = long_desc;
		this.updated_date = updated_date;
		this.date = date;
		this.active = active;
		this.publisher = publisher;
		this.author = author;
		this.category = category;
		this.language = language;
		this.commentsList = commentsList;
		this.avgRating = avgRating;
	}

}
