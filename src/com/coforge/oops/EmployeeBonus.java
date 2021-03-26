package com.coforge.oops;

public class EmployeeBonus {
	String name;
	String designation;
	
public EmployeeBonus(String name,String designation){ 
		this.name=name;
		this.designation=designation;
	
		
	}
	
	double calcBonus(double basicAllowance) {
		return basicAllowance;
	}
	
	
	double calcBonus(double basicAllowance,double carAllowance) {
		return basicAllowance+carAllowance;
	}

	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance) {
		return basicAllowance+carAllowance+houseAllowance;
	}
}
