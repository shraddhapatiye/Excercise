package com.coforge.inher;

import java.util.Scanner;

public class AtmMainA {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice : saving or current");
		String choice = sc.next();
		
		AccountA account=null;
		switch(choice) {
		
		case "saving":
			account=new SavingA(2000);
			account.withdraw(500);
			account.deposit(5000);
			System.out.println("Balance: "+account.getBalance());
			SavingA saving=(SavingA)account;
			saving.checkInterest();
			break;
	
		case "current":
		account=new CurrentA(10000);
		account.withdraw(3000);
		account.deposit(8000);
		System.out.println("Balance: "+account.getBalance());
		CurrentA current=(CurrentA)account;
		current.checkInterest();
		break;
		
		default:
			System.out.println("Wrong choice");
			break;
}
		sc.close();
}
}


