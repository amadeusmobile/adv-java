package com.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.ws.Calculator")
public class CalImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		System.out.println("add method called...");
		return a + b;
	}

}
