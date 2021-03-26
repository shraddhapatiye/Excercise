import java.util.Scanner;

public class SumAverage {
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter elements into the array ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		int i;
		for(i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		double average=sum/num;
		System.out.println("sum of number : "+sum);
		System.out.println("Average of number : "+average);
	sc.close();
}
		
}


