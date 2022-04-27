package com.springboot.carefirst.bridge;

public class FirstTimeUserDiscount implements IDiscountService{
	//Concrete Implementor
	@Override
    public double getDiscount() {
        return 0.05;
    }

}
