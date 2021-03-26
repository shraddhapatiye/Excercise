package com.coforge.inher;

public class Car extends Vehicle {

String accessories;
public Car(String model,String brand,int price,String accessories) {
	super(model,brand,price);
	this.accessories=accessories;
}
 public void showAccessories() {
	 System.out.println("Accessories: "+accessories);
 }
 double getDiscount(double amount) {
	  return (amount+price);
				}
 }

