package com.springboot.carefirst.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.carefirst.model.Discount;
import com.springboot.carefirst.service.IDiscountService;

@RestController
public class DiscountController {

	@Autowired
	IDiscountService discountService;

	@CrossOrigin
	@GetMapping("/getDiscountPrice")
	public String getDiscountPrice(@RequestParam @Valid long discountId) {
		System.out.println("Get all data..");

		return discountService.getDiscountPrice(discountId);
	}

	@CrossOrigin
	@PostMapping("/addDiscount")
	public String addDiscount(@RequestBody @Valid Discount discount) {
		String contact = discountService.addDiscount(discount);
		return contact;
	}

	@CrossOrigin
	@PutMapping("/updateDiscount")
	public String updateDiscount(@RequestBody @Valid Discount discount) {
		String response = discountService.updateDiscount(discount);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteDiscount")
	public String deleteDiscount(@RequestParam Long discountId) {
		String response = discountService.deleteDiscount(discountId);
		return response;
	}

	@CrossOrigin
	@GetMapping("/isValid")
	public String isValid(@RequestParam @Valid long discountId) {

		return discountService.isValid(discountId);
	}

	@CrossOrigin
	@GetMapping("/isUsed")
	public String isUsed(@RequestParam @Valid long discountId) {

		return discountService.isUsed(discountId);
	}
}
