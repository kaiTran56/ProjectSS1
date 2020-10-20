package com.team.model;

public class Ordered {
	private String ordered_id;
	private String product_id;
	private String transaction_id;
	private int amount;

	public Ordered(String ordered_id, String product_id, String transaction_id, int amount) {
		super();
		this.ordered_id = ordered_id;
		this.product_id = product_id;
		this.transaction_id = transaction_id;
		this.amount = amount;
	}

	public String getOrdered_id() {
		return ordered_id;
	}

	public void setOrdered_id(String ordered_id) {
		this.ordered_id = ordered_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
