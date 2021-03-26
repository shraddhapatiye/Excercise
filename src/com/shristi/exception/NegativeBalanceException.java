package com.shristi.exception;

public class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
		super();
	}
	public NegativeBalanceException(String message) {
		super(message);
	}
}
