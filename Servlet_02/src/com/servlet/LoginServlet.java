package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private String username = "wang";
	private String password = "123456";
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("login");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		String rName = request.getParameter("username");
		String rPass = request.getParameter("password");
		if (rName.equals(username) && rPass.equals(password)) {
			System.out.println("welcome");
			response.sendRedirect("welcome.html");
		} else {
			System.out.println("sorry ");
			response.sendRedirect("login2.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
