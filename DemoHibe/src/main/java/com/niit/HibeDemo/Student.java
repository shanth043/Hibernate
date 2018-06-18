package com.niit.HibeDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//Thius is an entity class
public class Student {

	@Id
	private int sid;
	private String sname;
	private String saddress;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
		
		
		
	}
  //to fetch the data from the database
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}

}
