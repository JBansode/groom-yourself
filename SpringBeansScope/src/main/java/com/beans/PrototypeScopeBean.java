package com.beans;

public class PrototypeScopeBean {
	
	String name;
	int rollNo;
	
	public PrototypeScopeBean(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	

}
