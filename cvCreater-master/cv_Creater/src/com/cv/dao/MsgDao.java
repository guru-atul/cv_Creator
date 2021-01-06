package com.cv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cv.connector.DataConnector;
import com.cv.data.MsgData;

public class MsgDao {
public static int Register(MsgData data) { 
	
	int i=0;
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	
	session.save(data);
	t.commit();
	System.out.println("Data Saved.");
	i++;
	
	session.close();
    
    return i;
}
}
