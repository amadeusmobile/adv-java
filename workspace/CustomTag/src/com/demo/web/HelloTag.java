package com.demo.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;


public class HelloTag extends TagSupport {
	PageContext pageContext;
	
	private String color="black";

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().write("<h1 style=\"color:"+color+"\">Hello JSP Tag</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
