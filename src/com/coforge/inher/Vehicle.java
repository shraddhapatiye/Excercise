package com.coforge.inher;

 class Vehicle {
	 String model;
	String brand;
	int price;
	
	public Vehicle(String model,String brand,int price) {
		super();
		this.model=model;
		this.brand=brand;
		this.price=price;

}
	public void getDetails() {
		System.out.println("Model: "+model);
		System.out.println("Brand: "+brand);
	    System.out.println("Price: "+price);
	
	}
	double getDiscount(double amount) {
		  return (amount+price);
					}
	
}