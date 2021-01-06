package com.cv.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/com.cv.services.ServiceLogout")
public class ServiceLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.setContentType("text/html");
           PrintWriter pw=response.getWriter();
           
           HttpSession session=request.getSession(false);
           
           if(session!=null) {
        	   session.invalidate();
           }
        	
           System.out.println("user logged out.");
           pw.println("<center><h3><font color='red'>You are Logged out</font></h3></center>");
           RequestDispatcher rd=request.getRequestDispatcher("Login");
           rd.include(request, response);
    	
    	}

}
