package com.springboot.carefirst.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.springboot.carefirst.model.Address;
import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.Order;

@Service
public class OrderService implements IOrderService{

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addOrder(@Valid Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateOrder(@Valid Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrder(Long orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrderDate(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getShippedDate(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getOrderClientAddress(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getOrderClientInfo(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
