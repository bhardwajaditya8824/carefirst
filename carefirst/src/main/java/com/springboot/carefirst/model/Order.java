package com.springboot.carefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@Column(name = "client_id")
    private Long clientId;
	
	@Column(name = "order_date")
    private String    orderDate;
	
	@Column(name = "shipped_date")
    private String    shippedDate;
	
    @Column(name = "address_id")
	private int addressId;
    
    @Column(name = "product_id")
	private int productId;
    
    @Column(name = "payment_id")
    private String paymentId;
    
    @Column(name = "order_status")
    private String orderStatus;
    
    @Column(name = "promo_code")
    private String promoCode;
    
    @Column(name = "cart_price")
    private Double cartPrice;
    
    @Column(name = "delivery_charge")
    private Long deliveryCharge;
    
    @Column(name = "discount_Id")
    private double discountId;
    
    @Column(name = "final_amount")
    private double finalAmount;
    
    @Column(name = "service_Type")
    private String serviceType;
    
    @Column(name = "order_type")
    private String orderType;
    
    @Column(name = "is_prescribed")
    private Integer isPrescribed;

	public Order() {
		super();
	}

	public Order(Long orderId, Long clientId, String orderDate, String shippedDate, int addressId, int productId,
			String paymentId, String orderStatus, String promoCode, Double cartPrice, Long deliveryCharge,
			double discountId, double finalAmount, String serviceType, String orderType, Integer isPrescribed) {
		super();
		this.orderId = orderId;
		this.clientId = clientId;
		this.orderDate = orderDate;
		this.shippedDate = shippedDate;
		this.addressId = addressId;
		this.productId = productId;
		this.paymentId = paymentId;
		this.orderStatus = orderStatus;
		this.promoCode = promoCode;
		this.cartPrice = cartPrice;
		this.deliveryCharge = deliveryCharge;
		this.discountId = discountId;
		this.finalAmount = finalAmount;
		this.serviceType = serviceType;
		this.orderType = orderType;
		this.isPrescribed = isPrescribed;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public Double getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(Double cartPrice) {
		this.cartPrice = cartPrice;
	}

	public Long getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(Long deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public double getDiscountId() {
		return discountId;
	}

	public void setDiscountId(double discountId) {
		this.discountId = discountId;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getIsPrescribed() {
		return isPrescribed;
	}

	public void setIsPrescribed(Integer isPrescribed) {
		this.isPrescribed = isPrescribed;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", clientId=" + clientId + ", orderDate=" + orderDate + ", shippedDate="
				+ shippedDate + ", addressId=" + addressId + ", productId=" + productId + ", paymentId=" + paymentId
				+ ", orderStatus=" + orderStatus + ", promoCode=" + promoCode + ", cartPrice=" + cartPrice
				+ ", deliveryCharge=" + deliveryCharge + ", discountId=" + discountId + ", finalAmount=" + finalAmount
				+ ", serviceType=" + serviceType + ", orderType=" + orderType + ", isPrescribed=" + isPrescribed + "]";
	}

	

}
