package com.demo.ejb;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Client {

	public static void main(String[] args) throws Exception {

		Properties props= new Properties();
		props.put(Context.PROVIDER_URL, "t3://localhost:7001");
		props.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		
		Context ctx = new InitialContext(props);
		
		ShoppingCart cart=(ShoppingCart)ctx.lookup("cart#com.demo.ejb.ShoppingCart");
		cart.buy("Pencil", 3);
		cart.buy("Pencil", 3);
		cart.buy("Pen", 3);
		cart.buy("Ram", 3);
		cart.buy("Ram", 4);
		cart.buy("Pen", 1);
		
		System.out.println(cart.getCart());
		
		cart.checkout();
		
		System.out.println(cart.getCart());

	}

}
