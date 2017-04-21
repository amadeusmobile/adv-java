package com.demo.ejb;

import java.util.HashMap;

import javax.ejb.Remote;
@Remote
public interface ShoppingCart {
	public void buy(String itemName, int itemQty);

	public HashMap<String, Integer> getCart();

	public void checkout();
}
