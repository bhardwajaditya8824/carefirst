package com.springboot.carefirst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.carefirst.model.Order;

//Proxy
public class SalesReportProxy implements ISalesReport {

	@Autowired
	IOrderService orderService;
	SalesReport salesReport;

	@Override
	public List<Order> displayItemSold(String reportFormat, int reportEntries) {
		return orderService.getAll();

	}

	@Override
	public void generateSalesCost(String reportFormat, int reportEntries) {

		if(salesReport==null)
		{
			salesReport = new SalesReport();
//		List<Order> orderList = new ArrayList<Order>();
//
//		orderList = orderService.getAll();
//		int cost = 0;
//		for (Order order : orderList) {
//
//			cost += order.getFinalAmount();
//		}
		
		salesReport.generateSalesCost(reportFormat, reportEntries);

		

	}
	}

	

}
