package com.coforge.oops;

public class DemoMobile {
	 public static void main(String[] args) {
			Mobile mobile = new Mobile();
			mobile.brand = "Redmi";
			mobile.model = "MIK20PRO";
			mobile.price = 30000;
			mobile.getDetails();
			System.out.println("final price "+mobile.DiscountedPrice(1000));
			//System.out.println(mobile.brand + "\t" + mobile.model + "\t" + mobile.price);
			Mobile mobile1 = new Mobile();
			mobile1.brand = "REDMI";
			mobile1.model = "note7PRO";
			mobile1.price = 12000;
			mobile1.getDetails();
			System.out.println("Final price "+mobile1.DiscountedPrice(1100));
			//System.out.println(mobile1.brand + "\t" + mobile1.model + "\t" + mobile1.price);

			 }

}
