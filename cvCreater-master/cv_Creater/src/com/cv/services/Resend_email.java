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

import com.cv.msg.MailSender;

@WebServlet("/com.cv.services.Resend_email")
public class Resend_email extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	HttpSession session=request.getSession();
	
	String email=(String)session.getAttribute("email");
	
//	System.out.println("we are at resend controller and email is: "+email);
//  
	try {
		int pin=Resend_email.generatePin();
		String key=Integer.toString(pin);
		
		MailSender.sendMail(email, "Reset Password","verfication code for reset password is: "+key+" applicable for only one time.");
/*		System.out.println("Email of verification code is sent again to uset we are at resend controller and key is :"+key);
*/	    session.setAttribute("key",key);
		pw.println("<center><h3><font color='green'>verfication code is sent to your email please check your inbox.</font></h3></center>");
		request.getRequestDispatcher("verify_pin").include(request, response);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
