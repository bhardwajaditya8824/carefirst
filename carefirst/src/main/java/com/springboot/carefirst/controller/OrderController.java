package com.springboot.carefirst.controller;

import java.util.List;

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

import com.springboot.carefirst.model.Address;
import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.Order;
import com.springboot.carefirst.service.IOrderService;



@RestController
public class OrderController {
	@Autowired
	IOrderService orderService;

	@GetMapping("/allOrderes")
	public List<Order> getAllOrderes() {

		return orderService.getAll();
	}

	@CrossOrigin
	@PostMapping("/addOrder")
	public String addOrder(@RequestBody @Valid Order order) {
		String contact = orderService.addOrder(order);
		return contact;
	}

	@CrossOrigin
	@PutMapping("/updateOrder")
	public String updateOrder(@RequestBody @Valid Order order) {
		String response = orderService.updateOrder(order);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Long orderId) {
		String response = orderService.deleteOrder(orderId);
		return response;
	}

	@GetMapping("/getOrderDate")
	public String getOrderDate(@RequestParam Long orderId) {

		return orderService.getOrderDate(orderId);
	}

	@GetMapping("/getShippedDate")
	public String getShippedDate(@RequestParam Long orderId) {

		return orderService.getShippedDate(orderId);
	}

	@GetMapping("/getOrderClientAddress")
	public Address getOrderClientAddress(@RequestParam Long orderId) {

		return orderService.getOrderClientAddress(orderId);
	}

	@GetMapping("/getOrderClientInfo")
	public Client getOrderClientInfo(@RequestParam Long orderId) {

		return orderService.getOrderClientInfo(orderId);
	}



// getOrderDate   getShippedDate    getOrderClientAddress  getClient   addToCart removeFromCart 
}
