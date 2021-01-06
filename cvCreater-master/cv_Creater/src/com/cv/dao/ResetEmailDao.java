package com.cv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;

public class ResetEmailDao {
 public static int ResetEmail(String id,String newEmail) {
	 Session session=DataConnector.getConnect();
	 Transaction t=session.beginTransaction();
	 
	 Query q=session.createQuery("update RegisterData data set email=:newEmail where id=:id");
	 q.setParameter("id",id);
	 q.setParameter("newEmail", newEmail);
	 
	 int status=q.executeUpdate();
	 
	 t.commit();
	
	 
	
	 return status;
 }
	
}
