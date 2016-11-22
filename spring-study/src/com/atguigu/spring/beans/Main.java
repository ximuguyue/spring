package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*//���� HelloWorld ��һ������
		HelloWorld helloworld = new HelloWorld();
		//Ϊname ���Ը�ֵ
		helloworld.setName("atguigu");*/
		
		//1.���� Spring��IOC��������
		//ApplicationContext ���� IOC����
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡBean ʵ��
		//HelloWorld helloworld = (HelloWorld) ctx.getBean("helloworld");
		//3.����hello����
		//helloworld.hello();
		
	}
}
