package com.atguigu.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource datasource = (DataSource) ctx.getBean("dataSource");
		System.out.println("123");
		System.out.println(datasource.toString());
		System.out.println("123");
	}
}
