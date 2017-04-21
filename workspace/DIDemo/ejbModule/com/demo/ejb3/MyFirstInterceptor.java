package com.demo.ejb3;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class MyFirstInterceptor {
	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		Object retVal = null;
		System.out.println(" calling " + ctx.getMethod().getName());
		retVal = ctx.proceed();
		System.out.println(" Returning from " + ctx.getMethod().getName());
		return retVal;
	}
}
