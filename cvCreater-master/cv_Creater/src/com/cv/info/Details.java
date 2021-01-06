package com.cv.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/com.cv.info.Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	 PrintWriter pw=response.getWriter();
	 String time=request.getParameter("time");
	 HttpSession session=request.getSession();
	 String name=(String)session.getAttribute("name");
	 String id=(String)session.getAttribute("id");
	 
	 session.setAttribute("name", name);
	 session.setAttribute("id", id);
	 session.setAttribute("time", time);
	 
	 request.getRequestDispatcher("cv_details").forward(request, response);
	 
	 
	}

}
