package com.coforge.inher;

public class Saving  extends Account{
	
	public Saving(double balance) {
		super(balance);
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw amount from saving account ");
		balance= balance-amount-100;
	}
	public void deposit(double amount) {
		System.out.println("Amount deposited to saving account ");
		balance= balance+amount+100;
	}
	

}
