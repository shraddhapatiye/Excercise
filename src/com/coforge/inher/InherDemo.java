package com.coforge.inher;

import java.util.Scanner;

public class InherDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String choice = sc.next();
		
		System.out.println("enter car and bike");
		Vehicle vehicle=null;
		switch(choice) {
		
		case "car":
	
	vehicle=new Car("Car" , "Alto",500000,"music system");
	vehicle.getDetails();
	vehicle.getDiscount(1000);
	 Car car=(Car)vehicle;
	car.showAccessories();
	
	System.out.println();
	break;
		
		case "bike":
			
    vehicle = new Bike("Car","Maruti",300000,"music system",50);
    vehicle.getDetails();
    vehicle.getDiscount(2000);
    Bike bike =(Bike)vehicle;
    bike.showMileage();
	
break;
default:System.out.println("Wrong choice");
break;
}
		sc.close();
}
}