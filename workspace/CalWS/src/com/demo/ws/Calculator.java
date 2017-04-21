package com.demo.ws;

import javax.jws.WebService;

@WebService
public interface Calculator {
	public int add(int a, int b);
}
