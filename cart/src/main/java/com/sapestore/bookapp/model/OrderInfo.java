package com.sapestore.bookapp.model;


import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
/*@NamedQuery(name = "OrderInfo.findAllByOrderDate",
query ="SELECT * FROM OrderInfo od WHERE CAST(order_date AS date) BETWEEN order_date=? and order_date=? "
)*/ 
public class OrderInfo {
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private Integer userId;
	private double totalPayment;
	private int orderQuantity;
	private Timestamp orderDate;
	private Timestamp dispatchDate;
	private String orderStatus;
	private Timestamp updateDate;
	private Integer shippingAddressId;
	private Timestamp deliveryDate;

	
	@OneToMany(mappedBy = "orderInfo",fetch = FetchType.EAGER)
	@JsonIgnore
	List<OrderItemInfo> orderItems;

	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(Timestamp dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(Integer shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public List<OrderItemInfo> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemInfo> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderInfo(Integer orderId, Integer userId, double totalPayment, int orderQuantity, Timestamp orderDate,
			Timestamp dispatchDate, String orderStatus, Timestamp updateDate, Integer shippingAddressId,
			Timestamp deliveryDate, List<OrderItemInfo> orderItems) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.totalPayment = totalPayment;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
		this.dispatchDate = dispatchDate;
		this.orderStatus = orderStatus;
		this.updateDate = updateDate;
		this.shippingAddressId = shippingAddressId;
		this.deliveryDate = deliveryDate;
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", userId=" + userId + ", totalPayment=" + totalPayment
				+ ", orderQuantity=" + orderQuantity + ", orderDate=" + orderDate + ", dispatchDate=" + dispatchDate
				+ ", orderStatus=" + orderStatus + ", updateDate=" + updateDate + ", shippingAddressId="
				+ shippingAddressId + ", deliveryDate=" + deliveryDate +  "]";
	}


	


	
	

}
