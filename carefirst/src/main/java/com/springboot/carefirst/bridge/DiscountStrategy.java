package com.springboot.carefirst.bridge;

public enum DiscountStrategy {
	FIXED{
        @Override
        public double applyDiscount(double originalAmount, IDiscountService discount) {
        	//Abstraction and Refined Abstraction (Strategy)
            double discountAmount = discount.getDiscount();
            if(originalAmount > 40 && originalAmount > discountAmount)
                return originalAmount - discountAmount;
            return originalAmount;
        }
    },
    PERCENT{
        @Override
        public double applyDiscount(double originalAmount, IDiscountService discount) {
            double discountAmount = discount.getDiscount();
            if(originalAmount > 30)
                return discountAmount * originalAmount;
            return originalAmount;
        }
    };

    public abstract double applyDiscount(double originalAmount, IDiscountService discount);

}
