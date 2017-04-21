package com.demo.web;

public class User {
	private String name;
	private String city;
	private String email;
	private String details;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetails() {
		return name + " " + city + " " + email;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
