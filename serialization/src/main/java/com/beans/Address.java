package com.beans;

import java.io.Serializable;

public class Address implements Serializable{
	
	String city;
	
	public Address(String city){
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
