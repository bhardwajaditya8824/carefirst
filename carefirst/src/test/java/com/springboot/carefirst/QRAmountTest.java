package com.springboot.carefirst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.springboot.carefirst.model.CodeQRAmount;

class QRAmountTest {

	@Test
	void test() {
		CodeQRAmount code=new CodeQRAmount();
		
	double	expected =500;
	double actual= code.amountAssociated(101110);
		
		assertEquals(expected,actual);
	
		//fail();
	}

}
