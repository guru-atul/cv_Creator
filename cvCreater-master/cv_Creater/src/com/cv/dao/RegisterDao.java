package com.cv.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cv.connector.DataConnector;
import com.cv.data.RegisterData;

public class RegisterDao {
public static int register(RegisterData data) {
	int i=0,count=0;
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	String email=data.getEmail();
	System.out.println(email);
	
	List list=session.createQuery("from RegisterData data").list();
	Iterator it=list.iterator();
	
	while(it.hasNext()) {
		Object o=(Object)it.next();
		RegisterData r=(RegisterData)o;
/*		System.out.println("Email: "+r.getEmail());
*/		if(email.equals(r.getEmail())) {
			count++;
			break;
		}
	}
	
	
	if(count>0) {
		i=2;
		System.out.println("Already User.");
	}
	else if(count<=0) {
		i=1;
		session.save(data);
		t.commit();
		System.out.println("Data Saved.");
			}
	
	
	return i;
}
}
