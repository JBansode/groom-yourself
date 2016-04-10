package com.beans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.SingletonScopeBean;

public class SingletonScopeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		//1st instance
		SingletonScopeBean emp1 = (SingletonScopeBean) applicationContext.getBean("employee");
		System.out.println(emp1.getName() + ": " + emp1.getSalCode() );
		
		//update first emp1 instance
		emp1.setName("Amit");
		emp1.setSalCode(1609);
		
		//2nd instance
		SingletonScopeBean emp2 = (SingletonScopeBean) applicationContext.getBean("employee");
		System.out.println(emp2.getName() + " : " + emp2.getSalCode());
	}

}
