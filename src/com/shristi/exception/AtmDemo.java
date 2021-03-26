package com.shristi.exception;

import java.util.Scanner;

class NBank{

	int balance;
	
	public NBank(int balance) {
		super();
		this.balance = balance;
	}

void withdraw(int amount)throws OutOfLimitsException,NegativeBalanceException {
	try {
	if((balance-amount)<=0) {
			throw new NegativeBalanceException("Balance is negative");
		}
			else if(amount>5000) {
			throw new OutOfLimitsException("amount should be less than 0");
		}
		else {
				balance=balance-amount;
				System.out.println(balance);
			}
		}	catch(OutOfLimitsException e) {
			System.out.println("error.."+e.getMessage());
		}	catch(NegativeBalanceException e) {
			System.out.println("Negative balance"+e.getMessage());
		}
    }	
}
public class AtmDemo {

	public static void main(String args[]) {
	    System.out.println("Welcome");
            Scanner sc=new Scanner(System.in);
            int amount =sc.nextInt();
	        System.out.println("amount "+amount);
	        NBank bank=new NBank(9000);
            try {
	          bank.withdraw(amount);
	          System.out.println("Amount Withdrawn.");
	          
             }catch(OutOfLimitsException e) {
	         System.out.println(e.getMessage());
     	
	         }catch(NegativeBalanceException e) {
               System.out.println(e.getMessage());
      }	
            System.out.println("Good bye");
	           sc.close();    
	}
}

