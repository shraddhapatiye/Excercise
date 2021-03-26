package com.coforge.inher;

public abstract class AccountA {
	double balance;
	AccountA(double balance){
		super();
		this.balance=balance;
	}

	abstract void withdraw(double amount);
	abstract void deposit(double amount) ;
	
	double getBalance() {
		return balance;
	}
}