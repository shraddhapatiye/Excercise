package com.coforge.inher;

import java.util.Scanner;

public class AtmMain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice : saving or current");
		String choice = sc.next();
		
		Account account=null;
		switch(choice) {
		
		case "saving":
			account=new Saving(2000);
			account.withdraw(500);
			account.deposit(5000);
			System.out.println("Balance: "+account.getBalance());
			
			break;
	
		case "current":
		account=new Current(10000);
		account.withdraw(3000);
		account.deposit(8000);
		System.out.println("Balance: "+account.getBalance());
		break;
		
		default:
			System.out.println("Wrong choice");
			break;
}
		sc.close();
}
}