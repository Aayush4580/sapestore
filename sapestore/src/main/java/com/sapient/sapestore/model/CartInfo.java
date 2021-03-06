package com.sapient.sapestore.model;


import java.sql.Timestamp;
import java.util.List;


public class CartInfo {
	
	
	private Integer cartId;
	private double cartPrice;
	private Integer userId;
	private int quantity;
	private Timestamp createdDate;
	private Timestamp updatedDate;

	
	List<CartItems> cartItems;

	public CartInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartInfo(Integer cartId, double cartPrice, Integer userId, int quantity, Timestamp createdDate,
			Timestamp updatedDate, List<CartItems> cartItems) {
		super();
		this.cartId = cartId;
		this.cartPrice = cartPrice;
		this.userId = userId;
		this.quantity = quantity;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.cartItems = cartItems;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public double getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(double cartPrice) {
		this.cartPrice = cartPrice;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		return "CartInfo [cartId=" + cartId + ", cartPrice=" + cartPrice + ", userId=" + userId + ", quantity="
				+ quantity + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}


}
