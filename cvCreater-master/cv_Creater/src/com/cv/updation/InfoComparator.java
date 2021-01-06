package com.cv.updation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cv.connector.DataConnector;
import com.cv.data.InfoData;

public class InfoComparator {

	public static List<InfoData> getCompare(InfoData data,String time) {
	   
	   List<InfoData> record=new ArrayList<InfoData>();
	   Session session=DataConnector.getConnect();
	   Transaction t=session.beginTransaction();
	   
	   
	   Query q=session.createQuery("from InfoData data where time=:time");
	   q.setParameter("time", time);
	   
	   List<InfoData> list=q.list();
	   Iterator it=list.iterator();
	   
        while(it.hasNext()) {
        	Object o=(Object)it.next();
        	InfoData d=(InfoData)o;
        	if(data.getName().isEmpty()) {
        		data.setName(d.getName());
        	}
        	if(data.getEmail().isEmpty()) {
        		data.setEmail(d.getEmail());
        	}
        	if(data.getPhone().isEmpty()) {
        		data.setPhone(d.getPhone());
        	}
        	if(data.getAddress().isEmpty()) {
        		data.setAddress(d.getAddress());
        	}
        	if(data.getSsc().isEmpty()) {
        		data.setSsc(d.getSsc());
        	}
        	if(data.getSsc_per().isEmpty()) {
        		data.setSsc_per(d.getSsc_per());
        	}
        	if(data.getSsc_ins().isEmpty()) {
        		data.setSsc_ins(d.getSsc_ins());
        	}
        	if(data.getHsc().isEmpty()) {
        		data.setHsc(d.getHsc());
        	}
        	if(data.getHsc_per().isEmpty()) {
        		data.setHsc_per(d.getHsc_per());
        	}
        	if(data.getHsc_ins().isEmpty()) {
        		data.setHsc_ins(d.getHsc_ins());
        	}
        	if(data.getDgree().isEmpty()){
        		data.setDgree(d.getDgree());
        	}
        	if(data.getDgree_per().isEmpty()) {
        		data.setDgree_per(d.getDgree_per());
        	}
        	if(data.getDgree_ins().isEmpty()) {
        		data.setDgree_ins(d.getDgree_ins());
        	}
        	if(data.getDgree_name().isEmpty()){
        		data.setDgree_name(d.getDgree_name());
        	}
        	if(data.getObj().isEmpty()) {
        		data.setObj(d.getObj());
        	}
        	if(data.getS1().isEmpty()) {
        		data.setS1(d.getS1());
        	}
        	if(data.getS2().isEmpty()) {
        		data.setS2(d.getS2());
        	}
        	if(data.getS3().isEmpty()) {
        		data.setS3(d.getS3());
        	}
        	if(data.getS4().isEmpty()) {
        		data.setS4(d.getS4());
        	}
        	if(data.getS5().isEmpty()) {
        		data.setS5(d.getS5());
        	}
        	if(data.getS6().isEmpty()) {
        		data.setS6(d.getS6());
        	}
        	if(data.getS7().isEmpty()) {
        		data.setS7(d.getS7());
        	}
        	if(data.getS8().isEmpty()) {
        		data.setS8(d.getS8());
        	}
        	if(data.getS9().isEmpty()) {
        		data.setS9(d.getS9());
        	}
        	if(data.getS10().isEmpty()) {
        		data.setS10(d.getS10());
        	}
        	if(data.getP1name().isEmpty()) {
        		data.setP1name(d.getP1name());
        	}
        	if(data.getP1time().isEmpty()) {
        		data.setP1time(d.getP1time());
        	}
        	if(data.getP1desc().isEmpty()) {
        		data.setP1desc(d.getP1desc());
        	}
        	if(data.getP2name().isEmpty()) {
        		data.setP2name(d.getP2name());
        	}
        	if(data.getP2time().isEmpty()) {
        		data.setP2time(d.getP2time());
        	}
        	if(data.getP2desc().isEmpty()) {
        		data.setP2desc(d.getP2desc());
        	}
        	if(data.getAch1().isEmpty()) {
        		data.setAch1(d.getAch1());
        	}
        	if(data.getAch2().isEmpty()) {
        		data.setAch2(d.getAch2());
        	}
        	if(data.getAch3().isEmpty()) {
        		data.setAch3(d.getAch3());
        	}
        	if(data.getAch4().isEmpty()) {
        		data.setAch4(d.getAch4());
        	}
        	if(data.getAch5().isEmpty()) {
        		data.setAch5(d.getAch5());
        	}
        	if(data.getT1name().isEmpty()) {
        		data.setT1name(d.getT1name());
        	}
        	if(data.getT1_ins().isEmpty()) {
        		data.setT1_ins(d.getT1_ins());
        	}
        	if(data.getT1desc().isEmpty()) {
        		data.setT1desc(d.getT1desc());
        	}
        	if(data.getT2name().isEmpty()) {
        		data.setT2name(d.getT2name());
        	}
        	if(data.getT2_ins().isEmpty()) {
        		data.setT2_ins(d.getT2_ins());
        	}
        	if(data.getT2desc().isEmpty()) {
        		data.setT2desc(d.getT2desc());
        	}
        	if(data.getPlace().isEmpty()) {
        		data.setPlace(d.getPlace());
        	}
        	if(data.getDecname().isEmpty()) {
        		data.setDecname(d.getDecname());
        	}
        	if(data.getH1().isEmpty()) {
        		data.setH1(d.getH1());
        	}
        	if(data.getH2().isEmpty()) {
        		data.setH2(d.getH2());
        	}
        	if(data.getH3().isEmpty()) {
        		data.setH3(d.getH3());
        	}
        	if(data.getH4().isEmpty()) {
        		data.setH4(d.getH4());
        	}
        	if(data.getH5().isEmpty()) {
        		data.setH5(d.getH5());
        	}
        	record.add(data);
        }
        
	   
	   
	   
	   return record;
	   
	   
	}
	
}
