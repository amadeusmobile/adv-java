package com.demo.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Emp {
	private int empId;
	private String empName;
	private String city;
	private double salary;
	private Address address;
	private Set<String> family=new HashSet<String>();

	public Set<String> getFamily() {
		return family;
	}

	public void setFamily(Set<String> family) {
		this.family = family;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
