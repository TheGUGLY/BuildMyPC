package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.app.other.EnumStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Order_Id")
	private int orderId;
	
	@Column(name="Date_Of_Order")
	private final LocalDate doo = LocalDate.now();
	
	@Column(name="Order_Status",length =10)
	@Enumerated(EnumType.STRING)
	private EnumStatus status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_email")
	@JsonIgnore
	private User user;
	
	@Column(name="total")
	private double total;


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getDoo() {
		return doo;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", doo=" + doo + ", status=" + status + ", email=" + user + ", total="
				+ total + "]";
	}

	
	
	
	
}
