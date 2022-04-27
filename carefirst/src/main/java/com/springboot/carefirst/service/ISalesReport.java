package com.springboot.carefirst.service;
import java.util.List;

//Subject

import com.springboot.carefirst.model.Order;
public interface ISalesReport {
	
	List<Order> displayItemSold(String reportFormat,int reportEntries);
    void generateSalesCost(String reportFormat,int reportEntries);
    

}
