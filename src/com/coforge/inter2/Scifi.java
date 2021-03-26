package com.coforge.inter2;

public class Scifi extends BasicCalculator implements Scientific {

	@Override
	public void squar(int x) {
		// TODO Auto-generated method stub
		System.out.println("Square: "+(x*x));
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("Cube: "+(x*x*x));
	}

}
