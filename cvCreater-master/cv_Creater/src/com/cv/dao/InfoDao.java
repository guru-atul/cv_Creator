package com.cv.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cv.connector.DataConnector;
import com.cv.data.InfoData;

public class InfoDao {
public static int register(InfoData data) {
	int i=0;
	
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	
	
	session.save(data);
	i++;
	t.commit();
	System.out.println("Data Saved.");
	session.close();
	
	
	
	return i;
}
}
