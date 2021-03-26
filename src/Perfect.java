import java.util.Scanner;

public class Perfect {
	public static void main(String args[]){
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println(+num+ " is a perfect number");
		}
		else {
			System.out.println(+num+ " is not a perfect number");
	sc.close();
	
		}
}
	
}
	
