package com.springboot.carefirst.service;

import org.springframework.stereotype.Service;

import Command.AddToCartCommand;
import Command.Cart;
import Command.CartControl;
import Command.RemoveFromCartCommand;

@Service
public class ProductService implements IProductService {

	CartControl invoker;

	// client Implementation for command
	@Override
	public void cartAction() {
		// TODO Auto-generated method stub

		// user will have different discounts associated with carts accordingly
		Cart firstCart = new Cart("firstCart");

		AddToCartCommand addFirstCart = new AddToCartCommand(firstCart);

		RemoveFromCartCommand removeFirstCart = new RemoveFromCartCommand(firstCart);

		invoker.setCommand(addFirstCart);
		invoker.actionSelected();

		invoker.setCommand(removeFirstCart);
		invoker.actionSelected();

	}

}
