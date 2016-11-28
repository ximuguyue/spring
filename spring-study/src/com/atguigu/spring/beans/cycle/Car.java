package com.atguigu.spring.beans.cycle;

public class Car {

	public Car(){
		System.out.println("Car's Constructor ...");
	}
	private String brand;
	public void init(){
		System.out.println("init...");
	}
	public void destory(){
		System.out.println("destory...");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("setBrand...");
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
}
