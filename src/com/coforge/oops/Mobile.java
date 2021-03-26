package com.coforge.oops;

public class Mobile {
	String brand;
	String model;
	int price;
	
	public void getDetails() {

	System.out.println("Brand: "+brand);
	  System.out.println("Model: "+model);
	  System.out.println("Price: "+price);
	}
	
	public  double DiscountedPrice(int amount) {
		double discountPrice = price-amount;
		return discountPrice;
	}
	

	}


