package com.atguigu.spring.beans;

public class Car {
    private String brand;
    private String crop;
    private double price;
    private int maxSpeed;
    public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String brand, String crop, double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}
	public Car(String brand, String crop, int maxSpeed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
   

}
