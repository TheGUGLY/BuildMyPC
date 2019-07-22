package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	//create table 
@Table(name="Items")	//with this name
public class Item {
	@Id	//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//auto-generated
	private int itemId;
	@Column(name="Product_Id",length=10)
	private int product_id;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private double price;
	@Column(name="Order_Id",length=10)
	private int order_id;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getItemId() {
		return itemId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", product_id=" + product_id + ", quantity=" + quantity + ", price=" + price
				+ ", order_id=" + order_id + "]";
	}
	
	
	
	
	
}
