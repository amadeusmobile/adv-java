package com.demo.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName="cal")
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		
		return a + b;
	}

}
