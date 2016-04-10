package com.beans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Employee;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) applicationContext.getBean("employee");
		System.out.println(emp.getName() + ":" + emp.getSalCode());
		
		Address addr = (Address) applicationContext.getBean("address");
		System.out.println(addr.getZipcode());
		
	}

}
