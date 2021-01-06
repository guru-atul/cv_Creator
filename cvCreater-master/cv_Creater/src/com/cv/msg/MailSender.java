package com.cv.msg;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	
	public static void main(String[] args) {
		
	}
	
	public static int sendMail(String to,String subject,String message) {
		int i=0;
		
		String from="alert.fest@gmail.com";
		String fromPass="fest@123456";
		String emailServerPort="465";
		String emailSMTPServer="smtp.gmail.com";
		
		
		Properties props=new Properties();
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.host", emailSMTPServer);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port",emailServerPort);
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false()");

		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,fromPass);
			}
		};


		
		Session session=Session.getInstance(props, auth);
		
		try {
			MimeMessage msg=new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
		    InternetAddress[] toAddress= {new InternetAddress(to)};
		    msg.setRecipients(Message.RecipientType.TO,toAddress);
			msg.setSubject(subject);
			msg.setContent(message,"text/html");
			Transport.send(msg);
			i++;
		    System.out.println("Email send Successfully");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		return i;	
		}

}
