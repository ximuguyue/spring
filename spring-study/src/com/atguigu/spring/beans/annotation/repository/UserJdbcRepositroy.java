package com.atguigu.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRepositroy implements UserRepository {

	@Override
	public void save() {

		System.out.println("UserJdbcRepositroy save...");

	}

}
