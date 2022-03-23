package com.springboot.carefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "product_quantity")
	private String quantity;

	@Column(name = "product_price")
	private int price;

	@Column(name = "product_id")
	private int productId;

	@Column(name = "client_id")
	private int clientId;

	public Payment() {
		super();
	}

	public Payment(Long paymentId, String quantity, int price, int productId, int clientId) {
		super();
		this.paymentId = paymentId;
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.clientId = clientId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", quantity=" + quantity + ", price=" + price + ", productId="
				+ productId + ", clientId=" + clientId + "]";
	}

}
