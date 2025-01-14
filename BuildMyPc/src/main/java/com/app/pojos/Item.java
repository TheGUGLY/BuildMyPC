//package com.app.pojos;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity	//create table 
//@Table(name="Items")	//with this name
//public class Item {
//	@Id	//primary key
//	@GeneratedValue(strategy=GenerationType.IDENTITY)	//auto-generated
//	private int itemId;
//	
//	@Column(name="Product_Id",length=10)
//	private int product_id;
//	
//	@Column(name="Quantity")
//	private int quantity;
//	
//	@Column(name="Price")
//	private double price;
//	
//	@Column(name="productName")
//	private String productName;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="order_Id")
//	private Order order;
//	
//	public Item() {
//		super();
//	}
//
//	public Item(int itemId, int product_id, int quantity, double price, Order order) {
//		super();
//		this.itemId = itemId;
//		this.product_id = product_id;
//		this.quantity = quantity;
//		this.price = price;
//		this.order = order;
//	}
//	
//	
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
//	public int getProduct_id() {
//		return product_id;
//	}
//	public void setProduct_id(int product_id) {
//		this.product_id = product_id;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public int getItemId() {
//		return itemId;
//	}
//	@Override
//	public String toString() {
//		return "Item [itemId=" + itemId + ", product_id=" + product_id + ", quantity=" + quantity + ", price=" + price
//				+ ", order_id=" + order + "]";
//	}
//	
//	
//	
//	
//	
//}
