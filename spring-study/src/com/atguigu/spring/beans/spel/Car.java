package com.atguigu.spring.beans.spel;

public class Car {
    private String brand; 
    private double price;
    //��̥���ܳ�
    private String tyrePerimeter;
    
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	} 
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTyrePerimeter() {
		return tyrePerimeter;
	}

	public void setTyrePerimeter(String tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	} 
	
   

}
