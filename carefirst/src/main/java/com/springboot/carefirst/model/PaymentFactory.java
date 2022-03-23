package com.springboot.carefirst.model;

public class PaymentFactory extends BasePaymentFactory {

	@Override
	public OnlinePayment InitializePayment(String mode) {
		// TODO Auto-generated method stub
		OnlinePayment payment;
		switch (mode.toLowerCase()) {
		case "paypal":
			payment = new PaymentByCard();
			break;
		case "card":
			payment = new PaymentByPaypal();
			break;

		default:
			throw new IllegalArgumentException("Method not supported");
		}
		payment.Pay();

		return payment;
	}

}
