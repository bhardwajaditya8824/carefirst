package com.springboot.carefirst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.carefirst.model.Order;

public class SalesReportProxy implements ISalesReport {

	@Autowired
	IOrderService orderService;

	@Override
	public List<Order> displayItemSold(String reportFormat, int reportEntries) {
		return orderService.getAll();

	}

	@Override
	public int generateSalesCost(String reportFormat, int reportEntries) {

		List<Order> orderList = new ArrayList<Order>();

		orderList = orderService.getAll();
		int cost = 0;
		for (Order order : orderList) {

			cost += order.getFinalAmount();
		}

		return cost;

	}

}
