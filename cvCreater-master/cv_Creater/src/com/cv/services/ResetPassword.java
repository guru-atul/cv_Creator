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

import com.cv.dao.ResetDao;
import com.cv.msg.MailSender;
import com.gmailgui.mailer.MailSend;


@WebServlet("/com.cv.services.ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		HttpSession session=request.getSession();
		
		String email=request.getParameter("email");
/*		System.out.println("email is at controller: "+email);
		
*/		String verifiedEmail=ResetDao.Check(email);
		
		/*System.out.println("verified email is at controller is: "+verifiedEmail);
		*/
		/*if(verifiedEmail==email) {
			System.out.println("Email is verified at backend at controller: ");
		}
		else {
			System.out.println("Not verified Email at controller: ");
		}
		*/
		
		if(verifiedEmail!=null) {
		try {
			int pin=ResetPassword.generatePin();
			String key=Integer.toString(pin);
			
			
/*			System.out.println("Key is generated and values is: "+key);
*/			session.setAttribute("key", key);
			session.setAttribute("email", verifiedEmail);
		
			
			if((verifiedEmail==null)&&(verifiedEmail!=email)){
				pw.println("<center><h3><font color='red'>Please enter only registered email.</font></h3></center>");
			   request.getRequestDispatcher("password_reset").include(request, response);
			}
			else {
				MailSender.sendMail(email, "Reset Password","verfication code for reset password is: "+key+" applicable for only one time.");		
				pw.println("<center><h3><font color='green'>verfication code is sent to your email please check your inbox.</font></h3></center>");
				request.getRequestDispatcher("verify_pin").include(request, response);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		else {
		System.out.println("Unverified email at controller ResetPassword");
	    pw.println("<center><h3><font color='red'>Please enter email which is registered with us.</font></h3></center>");
	    request.getRequestDispatcher("password_reset").include(request, response);
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
