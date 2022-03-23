package com.springboot.carefirst.model;

public abstract class BasePaymentFactory {
	
	 public abstract OnlinePayment InitializePayment(String mode);

}
