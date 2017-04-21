package com.demo.ejb3;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CreditBean implements CreditLocal {

	@Override
	@TransactionAttribute(TransactionAttributeType.MANDATORY)
	@Interceptors({ MyFirstMethodInterceptor.class })
	public String getCredit() {

		return "good";
	}

}
