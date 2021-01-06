package com.cv.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.RegisterData;

public class ResetDao {
public static String Check(String email) {
	
	String str=null;
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	
	Query q=session.createQuery("from RegisterData data where email=:email");
	q.setParameter("email", email);
	
	List list=q.list();
	Iterator it=list.iterator();
	
	
	while(it.hasNext()) {
		Object o=(Object)it.next();
		RegisterData d=(RegisterData)o;
/*		System.out.println("User Email at dao is: "+d.getEmail());
*/		str=d.getEmail();
    }
	
	
	return str;
}
}
