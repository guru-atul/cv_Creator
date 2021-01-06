package com.cv.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.InfoData;

public class UpdateInfoDao {

	public static int getUpdate(InfoData d,String time) {
		int i=0;
		
		Session session=DataConnector.getConnect();
		Transaction t=session.beginTransaction();
		
		
		Query q=session.createQuery("update InfoData data set name=:name,email=:email,phone=:phone,address=:address,ssc=:ssc,ssc_per=:ssc_per,ssc_ins=:ssc_ins,hsc=:hsc,hsc_per=:hsc_per,hsc_ins=:hsc_ins,dgree=:dgree,dgree_per=:dgree_per,dgree_ins=:dgree_ins,dgree_name=:dgree_name,obj=:obj,s1=:s1,s2=:s2,s3=:s3,s4=:s4,s5=:s5,s6=:s6,s7=:s7,s8=:s8,s9=:s9,s10=:s10,p1name=:p1name,p1time=:p1time,p1desc=:p1desc,p2name=:p2name,p2time=:p2time,p2desc=:p2desc,ach1=:ach1,ach2=:ach2,ach3=:ach3,ach4=:ach4,ach5=:ach5,t1name=:t1name,t1_ins=:t1_ins,t1desc=:t1desc,t2name=:t2name,t2_ins=:t2_ins,t2desc=:t2desc,place=:place,decname=:decname,h1=:h1,h2=:h2,h3=:h3,h4=:h4,h5=:h5,updation_date=:updation_date,updation_time=:updation_time,dec=:dec where creation_time=:creation_time");
		q.setParameter("name", d.getName());
		q.setParameter("email", d.getEmail());
		q.setParameter("phone", d.getPhone());
		q.setParameter("address", d.getAddress());
		q.setParameter("ssc", d.getSsc());
		q.setParameter("ssc_per", d.getSsc_per());
		q.setParameter("ssc_ins", d.getSsc_ins());
		q.setParameter("hsc", d.getHsc());
		q.setParameter("hsc_per", d.getHsc_per());
		q.setParameter("hsc_ins", d.getHsc_ins());
		q.setParameter("dgree", d.getDgree());
		q.setParameter("dgree_per", d.getDgree_per());
		q.setParameter("dgree_ins", d.getDgree_ins());
		q.setParameter("dgree_name", d.getDgree_name());
		q.setParameter("obj", d.getObj());
		q.setParameter("s1", d.getS1());
		q.setParameter("s2", d.getS2());
		q.setParameter("s3", d.getS3());
		q.setParameter("s4", d.getS4());
		q.setParameter("s5", d.getS5());
		q.setParameter("s6", d.getS6());
		q.setParameter("s7", d.getS7());
		q.setParameter("s8", d.getS8());
		q.setParameter("s9", d.getS9());
		q.setParameter("s10", d.getS10());
		q.setParameter("p1name", d.getP1name());
		q.setParameter("p1time", d.getP1time());
		q.setParameter("p1desc", d.getP1desc());
		q.setParameter("p2name", d.getP2name());
		q.setParameter("p2time", d.getP2time());
		q.setParameter("p2desc", d.getP2desc());
		q.setParameter("ach1", d.getAch1());
		q.setParameter("ach2", d.getAch2());
		q.setParameter("ach3", d.getAch3());
		q.setParameter("ach4", d.getAch4());
		q.setParameter("ach5", d.getAch5());
		q.setParameter("h1", d.getH1());
		q.setParameter("h2", d.getH2());
		q.setParameter("h3", d.getH3());
		q.setParameter("h4", d.getH4());
		q.setParameter("h5", d.getH5());
		q.setParameter("t1name", d.getT1name());
		q.setParameter("t1_ins", d.getT1_ins());
		q.setParameter("t1desc", d.getT1desc());
		q.setParameter("t2name", d.getT2name());
		q.setParameter("t2_ins", d.getT2_ins());
		q.setParameter("t2desc", d.getT2desc());
		q.setParameter("place", d.getPlace());
		q.setParameter("decname", d.getDecname());
		q.setParameter("dec", d.getDec());
		q.setParameter("updation_date",d.getUpdation_date());
		q.setParameter("updation_time",d.getUpdation_time());
		q.setParameter("creation_time",time);
		
		int status=q.executeUpdate();
		t.commit();
		
          if(status>0) {
        	  i++;
          }
		
		return i;
	}
	
}
