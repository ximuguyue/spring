package com.atguigu.spring.beans.spel;

public class Person {
	private String name;
	private Car car;
	//引用 address bean的city 属性
	private String city;
	//根据car的price 确定info，car的parice 大于 300000 为金领
	//否者为白领
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}
	

}
