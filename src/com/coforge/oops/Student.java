package com.coforge.oops;

public class Student {
	String name;
	int id;
	int mark;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
public void getDetails() {
	System.out.println("Name of Students: "+name);
	System.out.println("ID of Students: "+id);
}
	public void getGrades(int[] marks)
	{
		int sum=0,average=0;
	for(int i=0;i<marks.length;i++)
	{
	sum=sum+marks[i];
	}
	average=sum/(marks.length);
	System.out.println("The sum of number : "+sum);
	System.out.println("The average of numbers: "+average);
	
	if(average > 90)
	{
	System.out.println("Grade : A");
	}
	else if (average > 70)
	{
	System.out.println("Grade : B");
	}
	else
	{
	System.out.println("Grade : C");
	}
	}
	}
	
