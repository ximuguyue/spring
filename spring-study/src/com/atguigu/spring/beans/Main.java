package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*//创建 HelloWorld 的一个对象
		HelloWorld helloworld = new HelloWorld();
		//为name 属性赋值
		helloworld.setName("atguigu");*/
		
		//1.创建 Spring的IOC容器对象
		//ApplicationContext 代表 IOC容器
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean 实例
		//HelloWorld helloworld = (HelloWorld) ctx.getBean("helloworld");
		//3.调用hello方法
		//helloworld.hello();
		
	}
}
