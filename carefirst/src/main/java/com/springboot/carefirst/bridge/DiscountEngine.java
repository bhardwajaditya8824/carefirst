package com.springboot.carefirst.bridge;


import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.carefirst.model.Customer;
import com.springboot.carefirst.model.Order;
import com.springboot.carefirst.repository.CustomerRepository;

public class DiscountEngine {
    private DiscountStrategy discountStrategy = DiscountStrategy.FIXED;
    private IDiscountService discount;

    @Autowired
    private CustomerRepository customerRepository;

    public Order applyDiscount(Order order){
        this.setDiscountStrategy(order.getPromoCode());
        this.setDiscountType(order.getPromoCode(),order.getOrderId()); 
        //Context for Strategy
        double discountedAmount =this.discountStrategy.applyDiscount(order.getCartPrice(),discount);
        order.setFinalAmount(discountedAmount);
        order.setFinalAmount(order.getCartPrice() - discountedAmount);
        return order;
    }

    private void setDiscountType(String promoCode, Long long1 ){

        PromoCodes code = PromoCodes.valueOf(promoCode);
        if(promoCode != null &&  !promoCode.isEmpty()) {
            switch (code) {
                case HOLIDAY07:
                    this.discount = new Holiday07();
                    break;
                case SALE15:
                    this.discount = new Sale15();
                    break;
                default:
                    break;
            }
        }
//        else{
//            Customer customer = customerRepository.findOne();
//            switch (customer.getCustomerTier()){
//                case "Prime":
//                    this.discount = new PrimeMemberDiscount();
//                    break;
//                case "First":
//                    this.discount = new FirstTimeUserDiscount();
//                    break;
//                default:
//                    break;
//            }
//        }

    }

    private void setDiscountStrategy(String promoCode){
        if(promoCode != null &&  !promoCode.isEmpty()) {
            this.discountStrategy = DiscountStrategy.PERCENT;
        }
    }



}

