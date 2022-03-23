package com.springboot.carefirst.service;
import java.util.List;

import com.springboot.carefirst.model.Order;
public interface ISalesReport {
	
	List<Order> displayItemSold(String reportFormat,int reportEntries);
    int generateSalesCost(String reportFormat,int reportEntries);
   

}
