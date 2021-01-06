package com.cv.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.dao.RegisterDao;
import com.cv.data.RegisterData;
import com.cv.msg.MailSender;


@WebServlet("/com.cv.services.ServiceRegister")
public class ServiceRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
       	  PrintWriter pw=response.getWriter();
       	  
       	  String name=request.getParameter("name");
       	  String email=request.getParameter("email");
       	  String password=request.getParameter("password");
       	  String contact=request.getParameter("contact");
       	  try {
			
       	  int pin=ServiceRegister.generatePin();
		  String id=Integer.toString(pin);
       	  
       	  RegisterData r=new RegisterData();
          r.setName(name);
       	  r.setEmail(email);
       	  r.setPassword(password);
       	  r.setContact(contact);
       	  r.setId(id);
       	  
       	  int i=RegisterDao.register(r);
       	  
       	  try {
       	    if(i==1) {
       	    	HttpSession session=request.getSession(true);
                session.setAttribute("name", name);
                session.setAttribute("id", id);
                MailSender.sendMail(email,"Welcome to cv_Creater", "Welcome to cv_Creater "+name+" we hope we can make your cv better than ever thanks for join us.");
   			    request.getRequestDispatcher("ServiceProfile").include(request, response);
       	    }
       	    else if(i==2) {
       	    	pw.println("<script type=\"text/javascript\">");	
   				pw.println("alert('you are already registered with us please login.');");
   				pw.println("location='Login';");
   				pw.println("</script>");
	        	
       	    }
       	  }catch (Exception e) {
		
       	  System.out.println("Error");
       	  }
       	  }
       	 catch (Exception e1) {
 			e1.printStackTrace();
 		}  
       	}
       	
       	public static int generatePin() throws Exception {
       		Random generator = new Random();
       		generator.setSeed(System.currentTimeMillis());
       		  
       		int num = generator.nextInt(99999) + 99999;
       		if (num < 100000 || num > 999999) {
       		num = generator.nextInt(99999);
       		if (num < 100000 || num > 999999) {
       		throw new Exception("Unable to generate PIN at this time..");
       		}
       		}
       		return num;
       		}

}
