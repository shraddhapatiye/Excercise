import java.util.Scanner;

public class Prime {

	public static void main(String args[]){
		int num,m=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		m=num/2;
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				System.out.println(+num+" is not prime number");
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println(+num+" is a prime number");
			}
			
		sc.close();
	}
}
	
