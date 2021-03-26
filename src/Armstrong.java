import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]){
		int num,remainder,temp,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		 temp=num;
		while(temp!=0) {
			 remainder = temp %10;
			 result=result+remainder*remainder*remainder;
			temp=temp/10;
			
		}
		if( result ==num) {
			System.out.println(+num+" is an Armstrong number");
		}
		else {
			System.out.println(+num+" is not an Armstrong number");
		}
		sc.close();
	}
	}
