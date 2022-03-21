package com.springboot.carefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long productId;
	
	@Column(name = "product_code")
	    private String  productCode;
	
	@Column(name = "product_name")
	    private String  productName;
	
	@Column(name = "description")
	    private String  description;
	
	@Column(name = "orignal_price")
	    private Long    orignalPrice;
	
	@Column(name = "last_price")
	    private Long    lastPrice;
	
	@Column(name = "target_level")
	    private Integer targetLevel;
	
	@Column(name = "reorder_level")
	    private Integer reorderLevel;
	
	@Column(name = "minimum_reorder")
	    private Integer minimumReorderQuantity;
	
	@Column(name = "quantity")
	    private String  quantityPerUnit;
	
	@Column(name = "discount_Id")
	    private Integer discountId;
	
	@Column(name = "category")
	    private String category;

	public Product() {
		super();
	}

	public Product(Long productId, String productCode, String productName, String description, Long orignalPrice,
			Long lastPrice, Integer targetLevel, Integer reorderLevel, Integer minimumReorderQuantity,
			String quantityPerUnit, Integer discountId, String category) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.description = description;
		this.orignalPrice = orignalPrice;
		this.lastPrice = lastPrice;
		this.targetLevel = targetLevel;
		this.reorderLevel = reorderLevel;
		this.minimumReorderQuantity = minimumReorderQuantity;
		this.quantityPerUnit = quantityPerUnit;
		this.discountId = discountId;
		this.category = category;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOrignalPrice() {
		return orignalPrice;
	}

	public void setOrignalPrice(Long orignalPrice) {
		this.orignalPrice = orignalPrice;
	}

	public Long getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Long lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Integer getTargetLevel() {
		return targetLevel;
	}

	public void setTargetLevel(Integer targetLevel) {
		this.targetLevel = targetLevel;
	}

	public Integer getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(Integer reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public Integer getMinimumReorderQuantity() {
		return minimumReorderQuantity;
	}

	public void setMinimumReorderQuantity(Integer minimumReorderQuantity) {
		this.minimumReorderQuantity = minimumReorderQuantity;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", description=" + description + ", orignalPrice=" + orignalPrice + ", lastPrice=" + lastPrice
				+ ", targetLevel=" + targetLevel + ", reorderLevel=" + reorderLevel + ", minimumReorderQuantity="
				+ minimumReorderQuantity + ", quantityPerUnit=" + quantityPerUnit + ", discountId=" + discountId
				+ ", category=" + category + "]";
	}
	
	

}
