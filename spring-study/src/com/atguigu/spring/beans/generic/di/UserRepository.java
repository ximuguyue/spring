package com.atguigu.spring.beans.generic.di;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepositroy<User>{

	private String name;
	public void setName(String name) {
		this.name = "TX";
	}

	@Override
	public String toString() {
		return "UserRepository [name=" + name + "]";
	}
	
}
