package com.coforge.inher;

public class Current extends Account{
	public Current(double balance) {
		super(balance);
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw amount from current account ");
		balance= balance-amount;
	}
	public void deposit(double amount) {
		System.out.println("Amount deposited to current account ");
		balance= balance+amount;
	}
	

}

