import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		int num,rem,reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		 
		while(num!=0) {
			 rem = num %10;
			 reverse=(reverse*10)+rem;
			num/=10;
			
		}
System.out.println("Reversed number: "+reverse);
sc.close();
}
}