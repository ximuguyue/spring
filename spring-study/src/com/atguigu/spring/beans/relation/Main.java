package com.atguigu.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		/*
		 * Address address1 = (Address) ctx.getBean("address1");
		 * System.out.println(address1);
		 */
		Address address1 = (Address) ctx.getBean("address2");
		System.out.println(address1);

		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
