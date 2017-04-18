package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html><head><title>Demo Form</title></head>");
		out.print("<body>");
		out.print("<form action=\"process\" method=\"get\">");
		out.print("Enter Name :<input type=\"text\" name=\"userName\"><br/>");
		out.print("Enter Password :<input type=\"password\" name=\"password\"><br/>");
		out.print("<input type=\"submit\" value=\"Save\">");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}
}
