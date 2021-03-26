package com.shristi.exception;

import java.util.Scanner;

public class Registration {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username ");
		String name=sc.nextLine();
		sc.close();
try {
	
	Validation val=new Validation();
	if(val.checkName(name)) {
	 System.out.println("you are registerd already");
	}
	
}catch	(Exception e) {
	
			System.out.println(e.getMessage());
		}

	}
}
