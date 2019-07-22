package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServerlet01 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html charset='UTF-8'");
		out.write("hello");
		out.write("<html>");
		out.write("<head>");
		out.write("<meat charset=\"UTF-8\">");
		out.write("<title>hello</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<div style='width:100px;height:100px;border:1px solid gray; background:red;'>");
		out.write("ÄãºÃ!");
		out.write("</div>");
		out.write("</body>");
		out.write("</html>");
		// super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		super.service(req, resp);
	}
	
}
