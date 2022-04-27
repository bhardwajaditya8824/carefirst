package com.springboot.carefirst.model;

public class CodeQRAmount {
	
	public CodeQRAmount()
	{
		super();
	}
	
	public double amountAssociated(int binary) {
		double amount=0;
		if(binary==101110)
		{
			amount=500;
		}
		return amount;
		
	}
	
	public double amountAssociated(String code) {
		double amount=0;
		if(code.equals("adsfgr43"))
		{
			amount=500;
		}
		return amount;
		
	}

}
