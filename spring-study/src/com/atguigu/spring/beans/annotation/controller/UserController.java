package com.atguigu.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.spring.beans.annotation.TestObject;
import com.atguigu.spring.beans.annotation.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired(required=false)
	private TestObject testObject;
	public void execute(){
		System.out.println("UserController execute...");
		userService.add();
		System.out.println(testObject);
	}
}
