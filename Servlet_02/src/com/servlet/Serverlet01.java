package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serverlet01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset='utf-8'>");
		out.write("</head>");	
		out.write("<body>");
		out.write("<div>你好</div>");
		out.write("</body>");
		out.write("</html>");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		响应头 空行 响应体
//		处理响应头
//		resp.setContentType("text/html");
//		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html; charset='utf-8'");
		super.service(req, resp);
	}

}
