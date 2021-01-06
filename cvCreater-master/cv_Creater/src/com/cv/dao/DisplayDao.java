package com.cv.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.InfoData;

public class DisplayDao {
	
public static List<InfoData> getDisplay(String id) {
	int i=0;
	
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	
	
	
	Query q=session.createQuery("from InfoData data where id=:id");
	q.setParameter("id", id);
	
	List<InfoData> lst=q.list();
    Iterator it=lst.iterator();
    
    List<InfoData> record=new ArrayList<InfoData>();
    
    while(it.hasNext()) {
    	Object o=(Object)it.next();
    	InfoData d=(InfoData)o;
    	record.add(d);
    	}

	
	return record;
}
	
}
