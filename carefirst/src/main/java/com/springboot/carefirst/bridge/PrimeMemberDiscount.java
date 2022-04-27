package com.springboot.carefirst.bridge;

public class PrimeMemberDiscount implements IDiscountService {
	//Concrete Implementor
	 @Override
	    public double getDiscount() {
	        return 0.10;
	    }
}
