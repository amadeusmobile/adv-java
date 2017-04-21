package com.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface Calculator {
	public int add(int a, int b);
}
