package com.springboot.carefirst.service;

import java.util.List;

import javax.validation.Valid;

import org.apache.tomcat.jni.Address;

import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.Order;

public interface IOrderService {

	List<Order> getAll();

	String addOrder(@Valid Order order);

	String updateOrder(@Valid Order order);

	String deleteOrder(Long orderID);

	String getOrderDate(Long orderId);

	String getShippedDate(Long orderId);

	com.springboot.carefirst.model.Address getOrderClientAddress(Long orderId);

	Client getOrderClientInfo(Long orderId);

}
