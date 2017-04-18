package com.demo.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class LoginTag extends TagSupport {
	PageContext pageContext;
	String targetPage;
	String authUser;
	String authPassword;
	String btnLabel;

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut()
					.write("<form action=\"" + targetPage + "\" method=\"post\"><table>"
							+ "<tr><td>Enter Name</td><td><input type=\"text\" name=\"" + authUser + "\"></td>"
							+ "</tr><tr><td>Enter Password</td><td><input type=\"password\" name=\"" + authPassword
							+ "\">" + "</td></tr><tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\""
							+ btnLabel + "\"></td>" + "</tr></table></form>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return EVAL_PAGE;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	public String getAuthUser() {
		return authUser;
	}

	public void setAuthUser(String authUser) {
		this.authUser = authUser;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public String getBtnLabel() {
		return btnLabel;
	}

	public void setBtnLabel(String btnLabel) {
		this.btnLabel = btnLabel;
	}

	public String getTargetPage() {
		return targetPage;
	}

	public void setTargetPage(String targetPage) {
		this.targetPage = targetPage;
	}

	
}
