package com.beans;

import java.io.Serializable;

public class PermanantEmployee extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String type;
	
	public PermanantEmployee(String type){
		super("Priya",23);
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
}
