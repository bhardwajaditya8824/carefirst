package com.springboot.carefirst.service;

import java.util.List;

import com.springboot.carefirst.model.Customer;

public interface ICustomerService {

	public List<Customer> getAll();

    public String addCustomer(Customer customer) ;
}
