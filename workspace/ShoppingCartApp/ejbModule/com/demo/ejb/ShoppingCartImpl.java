package com.demo.ejb;

import java.util.HashMap;

import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful(name = "shop", mappedName = "cart")
public class ShoppingCartImpl implements ShoppingCart {

	private HashMap<String, Integer> cart = new HashMap<String, Integer>();

	public void buy(String itemName, int itemQty) {
		if (cart.containsKey(itemName)) {
			int qty = cart.get(itemName);
			int newQty = qty + itemQty;
			cart.put(itemName, newQty);
		} else {
			cart.put(itemName, itemQty);
		}

	}

	public HashMap<String, Integer> getCart() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Remove
	public void checkout() {
		System.out.println("Cart Removed..");

	}

}
