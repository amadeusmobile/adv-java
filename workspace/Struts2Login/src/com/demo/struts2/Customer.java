package com.demo.struts2;

import java.util.List;

public class Customer {
	String name;
	String email;
	String description;
	String item;
	String country;
	List prices;

	public List getPrices() {
		return prices;
	}

	public void setPrices(List prices) {
		this.prices = prices;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside set Name :" + System.currentTimeMillis());
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
