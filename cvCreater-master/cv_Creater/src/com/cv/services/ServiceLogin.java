package com.cv.services;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.dao.LoginDao;
import com.cv.data.RegisterData;

/**
 * Servlet implementation class ServiceLogin
 */
@WebServlet("/com.cv.services.ServiceLogin")
public class ServiceLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter pw=response.getWriter();
	       
            String email=request.getParameter("email");
            String password=request.getParameter("password");
	       
     /*       System.out.println("Email at the controller side: "+email);
     */       
            List<RegisterData> record=LoginDao.Login(email, password);
           
/*            System.out.println("Again at controller");
*/           
            if(record.isEmpty()) {
            System.out.println("username or password incorrect.");
            request.getRequestDispatcher("Login").include(request, response);
            pw.println("<center><h3><font color='red'>username or password incorrect.</font><h3></center>");
            }
            
          	 else {
        	      Iterator it=record.iterator();
        	      HttpSession oldSession=request.getSession(false);
        	      if(oldSession!=null) {
        	    	  oldSession.invalidate();
        	      }
        	      
        	      HttpSession session=request.getSession(true);
        	      
        	     while(it.hasNext()) {
                  	Object o=(Object)it.next();
                  	RegisterData r=(RegisterData)o;
                  System.out.println("login attempt success");
     /*             System.out.println("name: "+r.getName());
                  System.out.println("id: "+r.getId());
     */             session.setAttribute("name",r.getName());
                  session.setAttribute("id", r.getId());
                  }
                  request.getRequestDispatcher("ServiceProfile").forward(request, response);
                  
          	 }
              
            
       	
       	}

}
