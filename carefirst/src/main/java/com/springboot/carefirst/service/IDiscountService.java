package com.springboot.carefirst.service;

import javax.validation.Valid;

import com.springboot.carefirst.model.Discount;



public interface IDiscountService {

	String deleteDiscount(Long discountId);

	String updateDiscount(@Valid Discount discount);

	String addDiscount(@Valid Discount discount);

	String getDiscountPrice(@Valid long discountId);

	String isValid(@Valid long discountId);

	String isUsed(@Valid long discountId);

}
