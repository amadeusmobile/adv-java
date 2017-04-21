package com.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.demo.ws.EmpService")
public class EmpServiceImpl implements EmpService {

	@Override
	public Emp getById(int empId) {
		Emp e = new Emp();
		e.setEmpId(empId);
		e.setName("Scott");
		e.setCity("London");
		e.setSalary(45000);
		return e;
	}

}
