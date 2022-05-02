package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class SessionServlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		out.println("<h1>Welcome to SpidersCrawl Solutions</h1>");
		out.println("<a href=/UrlRewritingDemo/test2?name="+name+">Click here to get user name</a>");
	}

}
