package com.shristi.inter1;

public abstract class Gadgets implements Accessories {
String model;
double price;
public Gadgets(String model, double price) {
	super();
	this.model = model;
	this.price = price;
}
public void geDetails() {
	System.out.println(model+""+price);
}
public abstract void getDiscountePrice(int amount);
}
