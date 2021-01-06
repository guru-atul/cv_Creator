package com.cv.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cv.dao.ResetEmailDao;
import com.cv.msg.MailSender;

@WebServlet("/com.cv.services.ResetEmail")
public class ResetEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	 
	  HttpSession session=request.getSession();
	  
	  String oldEmail=request.getParameter("oldemail");
	  String newEmail=request.getParameter("confirmemail");
      String name=(String)session.getAttribute("name");
      String id=(String)session.getAttribute("id");
	  int status=0;
      
      
    	  status=ResetEmailDao.ResetEmail(id, newEmail);
    	  if(status>0) {
  		    System.out.println("Email updated.");
  		    session.setAttribute("name", name);
  	        session.setAttribute("id", id);
  	        MailSender.sendMail(oldEmail, "Email is Changed", "Your email is changed any new information will be sent on your new email now.");
  	        MailSender.sendMail(newEmail, "Welcome to cv_Creater","Congratulations you have been successfully changed your email.");
  	        out.println("<script type=\"text/javascript\">");
  			out.println("alert('Your email is changed.');");
  			out.println("location='ServiceProfile';");
  			out.println("</script>");
  			}
  	  else {
  		    System.out.println("Email is not updated.");
  		    session.setAttribute("name", name);
  	        session.setAttribute("id", id);
  	        out.println("<script type=\"text/javascript\">");
  			out.println("alert('Your email is not changed please enter registered email only.');");
  			out.println("location='ServiceProfile';");
  			out.println("</script>");
  	        
  	  }
  	
    	    }
      
	   
    }


