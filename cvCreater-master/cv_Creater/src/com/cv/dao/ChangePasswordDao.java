package com.cv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;

public class ChangePasswordDao {

	public static int getChange(String email,String password) {
	    int i=0;
		
	    Session session=DataConnector.getConnect();
	    Transaction t=session.beginTransaction();
	    
	    int status=0;
	    
	/*    System.out.println("Expected email is: "+email);
	    System.out.println("Expected Password is: "+password);
	*/    
	    Query q=session.createQuery("update RegisterData data set password=:password where email=:email");
	    q.setParameter("password", password);
	    q.setParameter("email", email);
	    
	    status=q.executeUpdate();
	    t.commit();
	    
	    if(status>0) {
	    	System.out.println("password changed: "+status);
	    	i=status;
	    	session.close();
	    }
	    else {
	    	System.out.println("password is not changed: "+status);
	    	i=status;
	    	session.close();
	    	}
	    
	    
		return i;
		
	}
}
