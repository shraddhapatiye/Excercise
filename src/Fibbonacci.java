import java.util.Scanner;

public class Fibbonacci {

	public static void main(String args[]){
		int count,num1=0,num2=1,num3,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		count= sc.nextInt();
		//System.out.println(num1+" "+num2);
		for(i=2;i<count;i++) {
			num3=num1+num2;
		System.out.println("" +num3);
		num1=num2;
		num2=num3;
		sc.close();	
		}
		
		}
}
