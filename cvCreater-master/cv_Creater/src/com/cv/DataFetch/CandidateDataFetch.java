package com.cv.DataFetch;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.InfoData;

public class CandidateDataFetch {

	public static List<InfoData> getFetch(String id,String time) {
		
		Session session=DataConnector.getConnect();
        Transaction t=session.beginTransaction();
 
       
       Query q=session.createQuery("from InfoData data where id=:id");
        q.setParameter("id", id);
		
        List list=q.list();
        Iterator it=list.iterator();
        
        List<InfoData> rec=new ArrayList<InfoData>();
        
        while(it.hasNext()) {
        	Object o=(Object)it.next();
        	InfoData d=(InfoData)o;
        	/*System.out.println("candidate-name: "+d.getName());
        	System.out.println("Candidate-id: "+d.getId());
        	*/rec.add(d); 
        }
        
        Iterator it1=rec.iterator();
        List<InfoData> record=new ArrayList<InfoData>();
        
        while(it1.hasNext()) {
        	Object o=(Object)it1.next();
        	InfoData d=(InfoData)o;
        	if(d.getTime().equals(time)) {
        	/*	System.out.println("Creation time is: "+d.getTime());
        		System.out.println("name is: "+d.getName());
        	*/	record.add(d);
        	}
        }
      /*  if(record.isEmpty()) {
        	System.out.println("Record is empty here");
        	}
        else {
        	System.out.println("Record is not empty here");
        }
      */  
        return record;
	}
}
