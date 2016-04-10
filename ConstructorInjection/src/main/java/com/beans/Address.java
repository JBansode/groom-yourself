package com.beans;

public class Address {
	
	String city;
	String zipcode;
	
	/*public Address(){
		System.out.println("Lazy initialization of bean ");
	}*/
	
	public Address(String city, String zipcode){
		System.out.println("Address constructor injection");
		this.city = city;
		this.zipcode = zipcode;
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
