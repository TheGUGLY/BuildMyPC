package com.app.pojos;

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

import com.app.other.EnumCategory;

@Entity
@Table(name="OrderProduct")
public class OrderProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Product_Id")
	private int productId;
	
	@Column(name="Product_Name",length=30)
	private String productName;
	
	@Column(name="Brand",length=20)
	private String brand;
	
	@Column(name="Model_Number",length=15)
	private String modelNumber;
	
	@Column(name="Category",length=30)
	@Enumerated(EnumType.STRING)
	private EnumCategory category;
	
	@Column(name="Price")
	private double price;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="Description")
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="order_Id")
	private Order order;
	
	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public OrderProduct() {
		super();
	}


	public OrderProduct(int productId, String productName, String brand, String modelNumber, EnumCategory category,
			double price, int quantity, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public EnumCategory getCategory() {
		return category;
	}

	public void setCategory(EnumCategory category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProductId() {
		return productId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", modelNumber=" + modelNumber
				+ ", category=" + category + ", price=" + price + ", quantity=" + quantity + ", description="
				+ description + "]";
	}

	public OrderProduct(int productId) {
		this.productId = productId;
	}

	
	
}
