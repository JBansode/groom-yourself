package com.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Employee;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getName() + " : " + employee.getSalCode());
		
		//get address bean
		Address address = (Address) context.getBean("address");
		System.out.println(address.getCity() + " : " + address.getZipcode());
		
	}

}
