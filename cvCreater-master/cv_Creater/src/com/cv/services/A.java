package com.cv.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/com.cv.services.A")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter pw=response.getWriter();
	   String loc=request.getParameter("file");
	   
	   
	   pw.println("<h1>"+loc+"</h1>");
	   
	   
    	
    	}

}
