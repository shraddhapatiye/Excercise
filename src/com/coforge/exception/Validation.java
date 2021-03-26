package com.coforge.exception;

//import com.shristi.exception.NegativeBalanceException;

public class Validation {
	String[] names = { "Sam", "john", "Helen", "Ram" };

	public boolean checkName(String name) throws NameExistException {
		try {

			for (String val : names) {

				if (val.equals(name)) {
					throw new NameExistException("name exist already");
				}
			}
		} catch (Exception e) {
			System.out.println("Error..");
			// throw e;
		}
		return true;
	}

	void checkPassword(String pass) throws TooShortException, TooLongException {
		if ((pass.length()) < 5) {
			throw new TooShortException("password is short");
		} else {
			throw new TooLongException("password is long");
		}

	}
}
