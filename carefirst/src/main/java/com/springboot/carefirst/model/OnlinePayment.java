package com.springboot.carefirst.model;

public abstract class OnlinePayment {
	
	public abstract void Pay();
    public void PaymentSuccesfull() {
        System.out.println("Payment Succesfull.");
    }

}
