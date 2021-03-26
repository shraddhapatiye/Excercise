package com.coforge.inter2;

public class LambdaDemoC {
	public static void main(String args[]) {
		
		
Calculator1 cal= (x, y) -> System.out.println("sum "+(x+y));
	cal.calculate(10,20);
	
cal=(x,y)->System.out.println("product"+(x*y));
	cal.calculate(2,3);
     
cal=(x,y)->System.out.println("difference"+(x-y));
    cal.calculate(80,50);
        
cal=(x,y)->System.out.println("divide"+(x/y));
    cal.calculate(40,2);

}
     }

