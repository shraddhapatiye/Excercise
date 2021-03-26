package com.coforge.exception;

import java.util.Scanner;

public class Register {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username ");
		
		
		try {
			String name=sc.nextLine();
			Validation val=new Validation();
            if(val.checkName(name)) {
	        System.out.println("Enter your password");
	        String pass=sc.next();
	        val.checkPassword(pass);
	         System.out.println("registerd successfully");
         }
}catch	(NameExistException | TooShortException|TooLongException e ) {
	System.out.println(e.getMessage());
		}

	sc.close();
	
}

}



