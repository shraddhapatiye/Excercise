package com.coforge.inher;

public class Account {
	double balance;
	Account(double balance){
		super();
		this.balance=balance;
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw amount in bank");
	}
	public void deposit(double amount) {
		System.out.println("Amount deposited in bank");
	}

	double getBalance() {
		return balance;
	}
}
