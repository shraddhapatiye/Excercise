package com.coforge.inter2;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new BasicCalculator();
		cal.add(10,30);
		cal.difference(90,50);
		cal.product(40, 3);
		cal.divide(40, 2);
		
		Scientific sc =new Scifi();
		sc.squar(2);
		sc.cube(2);

	}

}
