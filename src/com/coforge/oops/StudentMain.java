package com.coforge.oops;

import java.util.Scanner;

public class StudentMain {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Name");
			String name = sc.nextLine();
			
			 System.out.println("Enter id");
				int id = sc.nextInt();
		
				int count;
				
				System.out.println("Enter Number ");
				count = sc.nextInt();
				 int[] marks= new int[count];
				 System.out.println("Enter Marks");
				for(int i=0;i<marks.length;i++) {
					marks[i]=sc.nextInt();
				}
			
			
			sc.close(); 
		
			
		Student student1 = new Student(name , id);
		    student1.getDetails();
			student1.getGrades(marks);
	
			 }
			
		}

