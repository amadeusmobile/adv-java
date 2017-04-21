package com.demo.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	String userName;
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		UserDAO dao= new UserDAOImpl();
		String pwd= dao.getPassword(userName);
		if (userName.equals("tiger")) {
			throw new ApplicationException();
		} else {
			if (pwd.equals(password)) {
				return "success";
			} else {
				return "failure";
			}
		}
	}
	/*
	 * public void validate() { if (userName.length() == 0) {
	 * addFieldError("userName", getText("user.error")); } if (password.length()
	 * == 0) { addFieldError("password", getText("user.pwd")); } }
	 */
}
