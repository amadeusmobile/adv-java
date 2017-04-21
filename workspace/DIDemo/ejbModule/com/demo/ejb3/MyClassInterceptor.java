package com.demo.ejb3;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class MyClassInterceptor {
	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		Object retVal = null;
		System.out.println("Class Level " + ctx.getMethod().getName());
		retVal = ctx.proceed();
		System.out.println("Class Level " + ctx.getMethod().getName());
		return retVal;
	}
}
