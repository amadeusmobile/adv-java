package com.demo.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<Customer> {
	Customer customer=new Customer();
	/*Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

	public String execute() {
		System.out.println("Inside execute :"+System.currentTimeMillis());
		if (customer.name.equals("tiger")) {
			throw new ApplicationException("Some exception occured..");
		} else {
			Double price=(Double)customer.getPrices().get(0);
		return "success";
		}
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		System.out.println("Inside get Model :"+System.currentTimeMillis());
		return customer;
	}
}
