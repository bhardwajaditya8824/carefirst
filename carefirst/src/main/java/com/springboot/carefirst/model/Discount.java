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


	@Column(name = "valid_date")
	private String validDate;

	@Column(name = "is_used") // whether the discount have been utilized prior
	private String isUsed;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "binary")
	private int binary;

	public Discount() {
		super();
	}

	public Discount(Long discountId, String validDate, String isUsed, String code, int binary) {
		super();
		this.discountId = discountId;
		this.validDate = validDate;
		this.isUsed = isUsed;
		this.code = code;
		this.binary = binary;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBinary() {
		return binary;
	}

	public void setBinary(int binary) {
		this.binary = binary;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", validDate=" + validDate + ", isUsed=" + isUsed + ", code="
				+ code + ", binary=" + binary + "]";
	}

	
}
