package com.beans;

public class Address {
	
	String city;
	String zipcode;
	
	public Address(){
		System.out.println("Lazy initialization of bean ");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
