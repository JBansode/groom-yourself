package com.beans;

public class Employee {
	
	String name;
	int salCode;
	
	public Employee(){
		System.out.println("Employee bean is initialized when factory is created for the first time. i.e. Default initialization");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalCode() {
		return salCode;
	}
	public void setSalCode(int salCode) {
		this.salCode = salCode;
	}
	
	

}
