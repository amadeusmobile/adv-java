package com.demo.ws;

import javax.jws.WebService;

@WebService
public interface EmpService {
public Emp getById(int empId);
}
