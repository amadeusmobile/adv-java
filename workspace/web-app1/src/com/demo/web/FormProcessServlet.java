package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormProcessServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialized...");
		super.init(config);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy called.....");
		super.destroy();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost Called...");
		System.out.println(Thread.currentThread().getName());
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("userName");
		String password = req.getParameter("password");

		// out.print("<h1>" + username + " , " + password + "</h1>");
		if (username.equals(password)) {
			RequestDispatcher rd = req.getRequestDispatcher("/success");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/failure");
			rd.forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("You called doGet(...)");
	}
}
