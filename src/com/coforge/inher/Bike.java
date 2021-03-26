package com.coforge.inher;

public class Bike extends Car {
     int mileage;
	public Bike(String model,String brand,int price,String accessories,int mileage) {
		super(model,brand,price,accessories);
		this.mileage=mileage;
	}
	public void showMileage() {
		System.out.println("Mileage: "+mileage);
	}
	double getDiscount(double amount) {
		  return (amount+price);
					}

}
