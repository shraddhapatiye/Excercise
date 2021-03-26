package com.shristi.exception;

class Bank{
	void withdraw(int amount) {
		System.out.println("in bank");
		try {
			if(amount>1000) {
				throw new Exception("amount should be less than 0");
			}else {
				
		int balance=1000-amount;
		System.out.println("balance "+balance);
			}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("error..."+e.getMessage());
	}finally {
		System.out.println("close resource");
	}
		System.out.println("server done");
   }
}

public class TwoClassException {

	public static void main(String args[]) {
		System.out.println("Welcome");
try {
		String value =args[0];
	    int num=Integer.parseInt(value);
	    System.out.println("amount "+num);
	    Bank bank=new Bank();
	    bank.withdraw(num);
	    System.out.println("Amount Withdrawn.");
}catch(Exception e) {
	System.out.println("system problem.."+e.getMessage());
}	
}
}
