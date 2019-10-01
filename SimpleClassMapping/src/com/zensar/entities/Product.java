package com.zensar.entities;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 25th Sep 4.44PM
 * @modification_date 25th Sep 2019 4.44PM
 * @version 1.0
 * @copyright Zensar Technologuies, All rights reserved
 * @description It is a persistent class
 * 				It represents database table product
 * 				It is POJO (Plain Old Java Objective) class
 *
 */
public class Product {

	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
    
	public Product(int productId, String name, String brand, float price) {
		
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
