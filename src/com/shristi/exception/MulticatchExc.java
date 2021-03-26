package com.shristi.exception;

public class MulticatchExc {

	public static void main(String args[]) {
		System.out.println("Welcome");
		try {
		String value =args[0];
		System.out.println("value "+value);
	int num=Integer.parseInt(value);
	System.out.println("num "+num);
	int total=100/num;
	System.out.println("total "+total);
	//int[] marks=null;
	//System.out.println(marks[2]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException |ArithmeticException | NullPointerException e) {
			System.out.println("enter number greater than 0");
		}catch( Exception  e) {
			e.printStackTrace();
			System.out.println("other Exceptionr");
	}
		System.out.println("completed");
}
}

