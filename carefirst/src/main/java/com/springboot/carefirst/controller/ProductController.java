package com.springboot.carefirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.carefirst.service.IManagerService;
import com.springboot.carefirst.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired // no need to add confirmations or properties for this class
	IProductService productService; 
	
	@CrossOrigin
	@PostMapping("/cart")
	public void cartAction(){
		
		productService.cartAction();
	}

}
