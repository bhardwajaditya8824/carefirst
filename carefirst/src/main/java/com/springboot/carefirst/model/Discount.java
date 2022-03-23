package com.springboot.carefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount {

	@Id
	@Column(name = "discount_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long discountId;

	@Column(name = "price")
	private String price;

	@Column(name = "valid_date")
	private String validDate;

	@Column(name = "is_used") // whether the discount have been utilized prior
	private String isUsed;

	public Discount() {
		super();
	}

	public Discount(Long discountId, String price, String validDate, String isUsed) {
		super();
		this.discountId = discountId;
		this.price = price;
		this.validDate = validDate;
		this.isUsed = isUsed;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", price=" + price + ", validDate=" + validDate + ", isUsed="
				+ isUsed + "]";
	}

}
