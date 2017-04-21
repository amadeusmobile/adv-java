package com.demo.ejb3;

import javax.ejb.Remote;

@Remote
public interface LoanRemote {
	public String applyLoan();
}
