package com.atguigu.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	@Autowired
	protected BaseRepositroy<T> repositroy;
	
	public void add(){
		System.out.println("add...");
		System.out.println(repositroy.toString());
	}
}
