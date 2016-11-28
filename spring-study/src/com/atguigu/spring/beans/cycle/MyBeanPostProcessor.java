package com.atguigu.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("car".equals(beanName)){
			System.out.println("car.......");
		}
		System.out.println("postProcessAfterInitialization:" + beanName+","+bean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization:" + beanName+","+bean);
		Car car = new Car();
		car.setBrand("Ford");
		return bean;
	}

}
