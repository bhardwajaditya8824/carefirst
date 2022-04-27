package com.springboot.carefirst.bridge;

public class Sale15 implements IDiscountService{
	//Concrete Implementor
	  @Override
	    public double getDiscount() {
	        return 15;
	    }
}
