package com.demo.ejb3;
import java.util.Properties;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import javax.naming.Context;
import javax.naming.InitialContext;

@Stateless(mappedName = "loan")
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors({MyClassInterceptor.class})
public class LoanBean implements LoanRemote {
	@EJB()
	CreditLocal credit;
	

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public String applyLoan() {
		
		System.out.println("Getting credit rating....");
		System.out.println(" Got rating as " + credit.getCredit());
		return "Approved";
	}

}
