package com.cv.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info")

public class InfoData {

	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="email")
	private String email;

	@Column(name="phone")
	private String phone;
	
	@Column(name="10th")
	private String ssc;
	
	@Column(name="10_per")
	private String ssc_per;
	
	@Column(name="10_ins")
	private String ssc_ins;
	
	@Column(name="12th")
	private String hsc;
	
	@Column(name="12_per")
	private String hsc_per;
	
	@Column(name="12_ins")
	private String hsc_ins;
	
	@Column(name="dgree")
	private String dgree;
	
	@Column(name="dgree_per")
	private String dgree_per;

	@Column(name="dgree_ins")
	private String dgree_ins;

	@Column(name="dgree_name")
	private String dgree_name;
	

	@Column(name="obj")
	private String obj;
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="s1")
	private String s1;
	
	@Column(name="s2")
	private String s2;
	
	@Column(name="s3")
	private String s3;
	
	@Column(name="s4")
	private String s4;
	
	@Column(name="s5")
	private String s5;
	
	@Column(name="s6")
	private String s6;
	
	@Column(name="s7")
	private String s7;
	
	@Column(name="s8")
	private String s8;
	
	@Column(name="s9")
	private String s9;
	
	@Column(name="s10")
	private String s10;
	
	@Column(name="p1name")
	private String p1name;
	
	@Column(name="p1time")
	private String p1time;
	
	@Column(name="p1desc")
	private String p1desc;
	
	@Column(name="p2name")
	private String p2name;
	
	@Column(name="p2time")
	private String p2time;
	
	@Column(name="p2desc")
	private String p2desc;
	
	@Column(name="ach1")
	private String ach1;
	
	@Column(name="ach2")
	private String ach2;
	
	@Column(name="ach3")
	private String ach3;
	
	@Column(name="ach4")
	private String ach4;
	
	@Column(name="t1name")
	private String t1name;
	
	@Column(name="t1_ins")
	private String t1_ins;
	
	@Column(name="t1desc")
	private String t1desc;
	
	@Column(name="t2name")
	private String t2name;
	
	@Column(name="t2_ins")
	private String t2_ins;
	
	@Column(name="t2desc")
	private String t2desc;
	
	@Column(name="place")
	private String place;
	
	@Column(name="decname")
	private String decname;
	
	@Column(name="declaration")
	private String dec;

	@Column(name="h1")
	private String h1;
	
	@Column(name="h2")
	private String h2;
	
	@Column(name="h3")
	private String h3;
	
	@Column(name="h4")
	private String h4;
	
	@Column(name="h5")
	private String h5;
	
	
	@Column(name="id")
    private String id; 

	@Column(name="creation_date")
	private String date;

	
	@Column(name="creation_time")
	private String time;
	
	@Column(name="updation_date")
	private String updation_date;
	
	@Column(name="updation_time")
	private String updation_time;
	

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public String getUpdation_date() {
		return updation_date;
	}

	public void setUpdation_date(String updation_date) {
		this.updation_date = updation_date;
	}

	public String getUpdation_time() {
		return updation_time;
	}

	public void setUpdation_time(String updation_time) {
		this.updation_time = updation_time;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDgree_name() {
		return dgree_name;
	}

	public void setDgree_name(String dgree_name) {
		this.dgree_name = dgree_name;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getT1name() {
		return t1name;
	}

	public void setT1name(String t1name) {
		this.t1name = t1name;
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public String getH2() {
		return h2;
	}

	public void setH2(String h2) {
		this.h2 = h2;
	}

	public String getH3() {
		return h3;
	}

	public void setH3(String h3) {
		this.h3 = h3;
	}

	public String getH4() {
		return h4;
	}

	public void setH4(String h4) {
		this.h4 = h4;
	}

	public String getH5() {
		return h5;
	}

	public void setH5(String h5) {
		this.h5 = h5;
	}

	public String getT1_ins() {
		return t1_ins;
	}

	public void setT1_ins(String t1_ins) {
		this.t1_ins = t1_ins;
	}

	public String getT1desc() {
		return t1desc;
	}

	public void setT1desc(String t1desc) {
		this.t1desc = t1desc;
	}

	public String getT2name() {
		return t2name;
	}

	public void setT2name(String t2name) {
		this.t2name = t2name;
	}

	public String getT2_ins() {
		return t2_ins;
	}

	public void setT2_ins(String t2_ins) {
		this.t2_ins = t2_ins;
	}

	public String getT2desc() {
		return t2desc;
	}

	public void setT2desc(String t2desc) {
		this.t2desc = t2desc;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDecname() {
		return decname;
	}

	public void setDecname(String decname) {
		this.decname = decname;
	}

	public String getP1name() {
		return p1name;
	}

	public void setP1name(String p1name) {
		this.p1name = p1name;
	}

	public String getP1time() {
		return p1time;
	}

	public void setP1time(String p1time) {
		this.p1time = p1time;
	}

	public String getP1desc() {
		return p1desc;
	}

	public void setP1desc(String p1desc) {
		this.p1desc = p1desc;
	}

	public String getP2name() {
		return p2name;
	}

	public void setP2name(String p2name) {
		this.p2name = p2name;
	}

	public String getP2time() {
		return p2time;
	}

	public void setP2time(String p2time) {
		this.p2time = p2time;
	}

	public String getP2desc() {
		return p2desc;
	}

	public void setP2desc(String p2desc) {
		this.p2desc = p2desc;
	}

	public String getAch1() {
		return ach1;
	}

	public void setAch1(String ach1) {
		this.ach1 = ach1;
	}

	public String getAch2() {
		return ach2;
	}

	public void setAch2(String ach2) {
		this.ach2 = ach2;
	}

	public String getAch3() {
		return ach3;
	}

	public void setAch3(String ach3) {
		this.ach3 = ach3;
	}

	public String getAch4() {
		return ach4;
	}

	public void setAch4(String ach4) {
		this.ach4 = ach4;
	}

	public String getAch5() {
		return ach5;
	}

	public void setAch5(String ach5) {
		this.ach5 = ach5;
	}

	@Column(name="ach5")
	private String ach5;
	
	
	
	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getS4() {
		return s4;
	}

	public void setS4(String s4) {
		this.s4 = s4;
	}

	public String getS5() {
		return s5;
	}

	public void setS5(String s5) {
		this.s5 = s5;
	}

	public String getS6() {
		return s6;
	}

	public void setS6(String s6) {
		this.s6 = s6;
	}

	public String getS7() {
		return s7;
	}

	public void setS7(String s7) {
		this.s7 = s7;
	}

	public String getS8() {
		return s8;
	}

	public void setS8(String s8) {
		this.s8 = s8;
	}

	public String getS9() {
		return s9;
	}

	public void setS9(String s9) {
		this.s9 = s9;
	}

	public String getS10() {
		return s10;
	}

	public void setS10(String s10) {
		this.s10 = s10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSsc() {
		return ssc;
	}

	public void setSsc(String ssc) {
		this.ssc = ssc;
	}

	public String getSsc_per() {
		return ssc_per;
	}

	
	public String getSsc_ins() {
		return ssc_ins;
	}

	public void setSsc_ins(String ssc_ins) {
		this.ssc_ins = ssc_ins;
	}

	
	public void setSsc_per(String ssc_per) {
		this.ssc_per = ssc_per;
	}

	public String getHsc() {
		return hsc;
	}

	public void setHsc(String hsc) {
		this.hsc = hsc;
	}

	public String getHsc_per() {
		return hsc_per;
	}

	public void setHsc_per(String hsc_per) {
		this.hsc_per = hsc_per;
	}

	
	public String getHsc_ins() {
		return hsc_ins;
	}

	public void setHsc_ins(String hsc_ins) {
		this.hsc_ins = hsc_ins;
	}

	
	public String getDgree() {
		return dgree;
	}

	public void setDgree(String dgree) {
		this.dgree = dgree;
	}

	public String getDgree_per() {
		return dgree_per;
	}

	public void setDgree_per(String dgree_per) {
		this.dgree_per = dgree_per;
	}

	
	public String getDgree_ins() {
		return dgree_ins;
	}

	public void setDgree_ins(String dgree_ins) {
		this.dgree_ins = dgree_ins;
	}

	
	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
