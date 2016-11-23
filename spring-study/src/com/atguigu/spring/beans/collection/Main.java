package com.atguigu.spring.beans.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println(person2);
		NewPerson newperson = (NewPerson) ctx.getBean("newperson");
		System.out.println(newperson); 
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
		Person person3 = (Person) ctx.getBean("person3");
		System.out.println(person3);
		Person person4 = (Person) ctx.getBean("person4");
		System.out.println(person4);
	}
}
