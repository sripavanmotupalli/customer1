package org.sree.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet Called... :!");
		PrintWriter out=response.getWriter();
		String userName = request.getParameter("userName");
		out.print("welcome to HTML " +userName);
	}
	
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML post Servlet Called... :!");
		PrintWriter out=response.getWriter();
		String userName = request.getParameter("userName");
		out.print("welcome to post " +userName);
	}



}
