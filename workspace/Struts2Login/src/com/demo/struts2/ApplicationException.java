package com.demo.struts2;

public class ApplicationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ApplicationException(String message) {
		super(message);
	}
	public ApplicationException() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "An Application exception has occurred";
	}
}
