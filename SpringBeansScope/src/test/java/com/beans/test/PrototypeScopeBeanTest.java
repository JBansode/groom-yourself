package com.beans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.PrototypeScopeBean;

public class PrototypeScopeBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		PrototypeScopeBean prototypeBean = (PrototypeScopeBean)applicationContext.getBean("prototypeScope");
		System.out.println(prototypeBean.getName());
		
		prototypeBean.setName("ABC");
		//2nd instance
		PrototypeScopeBean prototypeBean2 = (PrototypeScopeBean)applicationContext.getBean("prototypeScope");
		System.out.println(prototypeBean2.getName());
	}

}
