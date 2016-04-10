package com.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;

public class LazyInitTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Test lazy init");
		Address addr = (Address) applicationContext.getBean("address");
		System.out.println(addr.getCity() + " === " + addr.getZipcode());
	}

}
