package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/res")
public class Resource1 {

	@GET
	public String greet() {
		return "Hello from REST";
	}

}
