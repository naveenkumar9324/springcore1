package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person=(Person)con.getBean("person4", Person.class);
		
		System.out.println(person);
	}

}
