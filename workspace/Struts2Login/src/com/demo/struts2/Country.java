package com.demo.struts2;

public class Country {
	String country;
	String desc;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(String country, String desc) {
		this.country = country;
		this.desc = desc;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
