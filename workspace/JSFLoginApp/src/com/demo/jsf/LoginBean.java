package com.demo.jsf;

import javax.faces.component.html.HtmlOutputText;

public class LoginBean {
	String userName;
	String password;
	HtmlOutputText loginFlag;

	public HtmlOutputText getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(HtmlOutputText loginFlag) {
		this.loginFlag = loginFlag;
	}

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

	public String doLogin() {
		if (userName.equals(password)) {
			//return "success";
			loginFlag.setValue("Login Successful");
			loginFlag.setStyle("color:green");
		} else {
			loginFlag.setValue("Login Failed");
			loginFlag.setStyle("color:red");
			//return "failure";
		}
		return "";
	}
}
