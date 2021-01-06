package com.cv.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.RegisterData;

public class LoginDao {
public static List<RegisterData> Login(String email,String password) {
	
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	
	String query="from RegisterData data where email=:email";
	Query q=session.createQuery(query);
	
	q.setParameter("email", email);
	
	List<RegisterData> list=new ArrayList<RegisterData>();
	
	list=q.list();
	
	List<RegisterData> record=new ArrayList<RegisterData>();
    
	
	if(list.isEmpty()) {
		System.out.println("Email incorrect.");
	}
	
	else {
	Iterator it=list.iterator();
	
 	
    
/*    System.out.println("Email at Dao: "+email);
*/    
    while(it.hasNext()) {
    Object o=(Object)it.next();
    RegisterData r=(RegisterData)o;
/*    System.out.println("name: "+r.getName());
    System.out.println("email from the database: "+r.getEmail());
    System.out.println("password: "+r.getPassword());
    System.out.println("contact: "+r.getContact());
*/    if(email.equals(r.getEmail())&&password.equals(r.getPassword())) {
    	record.add(r);
    }
    else {
     System.out.println("password incorrect");	
    	break;
    }
 }
	}
	
	return record;
}
}
