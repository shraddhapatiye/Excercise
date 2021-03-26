package com.shristi.exception;

public class FinallyException {

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
		//}catch( Exception  e) {
			//e.printStackTrace();
			System.out.println("other Exception");
	}finally {
		System.out.println("In finally block");
	}
		System.out.println("completed");
}
}

