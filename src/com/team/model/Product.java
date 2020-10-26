package com.team.model;

import java.time.LocalDateTime;

public class Product {
	private int product_id;
	private int catalog_id;
	private String name;
	private double price;
	private String status;
	private String description;
	private int discount;
	private String image_link;
	private LocalDateTime created;

	public Product(int product_id, int catalog_id, String name, double price, String status, String description,
			int discount, String image_link, LocalDateTime created) {
		super();
		this.product_id = product_id;
		this.catalog_id = catalog_id;
		this.name = name;
		this.price = price;
		this.status = status;
		this.description = description;
		this.discount = discount;
		this.image_link = image_link;
		this.created = created;
	}

	public Product(int catalog_id, String name, double price, String status, String description,
			int discount, LocalDateTime created) {
		super();
		this.catalog_id = catalog_id;
		this.name = name;
		this.price = price;
		this.status = status;
		this.description = description;
		this.discount = discount;
		this.created = created;
	}

	public Product(int product_id, String image_link) {
		super();
		this.product_id = product_id;
		this.image_link = image_link;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getCatalog_id() {
		return catalog_id;
	}

	public void setCatalog_id(int catalog_id) {
		this.catalog_id = catalog_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

}
