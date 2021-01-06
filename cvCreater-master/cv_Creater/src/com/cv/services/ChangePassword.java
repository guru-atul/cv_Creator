package com.cv.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cv.dao.ChangePasswordDao;
import com.cv.msg.MailSender;

        @WebServlet("/com.cv.services.ChangePassword")
        public class ChangePassword extends HttpServlet {
	    private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
 	    PrintWriter pw=response.getWriter();
	    HttpSession session=request.getSession();
	    String verifiedemail=(String)session.getAttribute("email");
	    String verifiedpin=(String)session.getAttribute("key");
	    
	    System.out.println("verified pin is: "+verifiedpin);
	    
	    String password=request.getParameter("confirmpassword");
	    String pin=request.getParameter("pin");
	    
	    System.out.println("entered pin is: "+pin);
	    
	    if(pin.equals(verifiedpin)) {
	    	System.out.println("Inside of if at controller");
	    int i=ChangePasswordDao.getChange(verifiedemail,password);	
	    if(i>0) {
	    	/*System.out.println("password changed at controller end.");
	    	*/
	    	session.invalidate();
	    	MailSender.sendMail(verifiedemail, "Password Changed", "Your password has been Changed Successfully.");
	    	pw.println("<center><h3><font color='green'>Password Changed Successfully.</font></h3></center>");
	    	request.getRequestDispatcher("Login").include(request, response);
	    	
	    }
	    
	    }
	    else {
	    	
	    	System.out.println("Invalid pin.");
	    	pw.println("<center><h3><font color='red'>Wrong Pin.</font></h3></center>");
	    	request.getRequestDispatcher("verify_pin").include(request, response);
	    }
	    
	    
    	
    	}

}
