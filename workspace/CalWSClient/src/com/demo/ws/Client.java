package com.demo.ws;

public class Client {

	public static void main(String[] args) {
		CalImplService service= new CalImplService();
		Calculator cal=service.getCalImplPort();
		System.out.println(cal.add(22, 66));

	}

}
