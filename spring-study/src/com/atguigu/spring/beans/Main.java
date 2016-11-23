package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * //���� HelloWorld ��һ������ HelloWorld helloworld = new HelloWorld();
		 * //Ϊname ���Ը�ֵ helloworld.setName("atguigu");
		 */

		// 1.���� Spring��IOC��������
		// ApplicationContext ���� IOC����
		// ClassPathXmlApplicationContext ��ApplicationContext ��ʵ����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.��IOC�����л�ȡBean ʵ��
		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloworld");
		// 3.����hello����
		helloworld.hello();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
