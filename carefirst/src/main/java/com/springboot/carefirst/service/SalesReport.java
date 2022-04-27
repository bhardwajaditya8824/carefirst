package com.springboot.carefirst.service;

import java.util.ArrayList;
import java.util.List;

import com.springboot.carefirst.model.Order;


//Real Subject
public class SalesReport implements ISalesReport {
	
	

	public SalesReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Order>  displayItemSold(String reportFormat, int reportEntries) {
		System.out.println("item sold list generated");
		List<Order> order =new ArrayList<Order>();
		
		return order;
		
	}

	@Override
	public void generateSalesCost(String reportFormat, int reportEntries) {
		System.out.println("sales cost generated");
		
		
		
	}

	

}
