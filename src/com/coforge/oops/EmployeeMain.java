package com.coforge.oops;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Name");
			String name = sc.nextLine();
		 
			System.out.println("Enter designatiom");
			String designation = sc.nextLine();
			
		sc.close(); 
			
			EmployeeBonus employee1 = new EmployeeBonus(name,designation);
			if(designation.equals("Programmer")) {
				
			System.out.println("Basic Allowance "+employee1.calcBonus(1000));	
			}
			else if(designation.equals("Manager")) {
				System.out.println("Basic Allowance "+employee1.calcBonus(1000,5000));	
			}
			else
			{
				System.out.println("Basic Allowance "+employee1.calcBonus(1000,5000,10000));	
			}
			
			

	}	 
		
	

}
