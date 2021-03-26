import java.util.Scanner;

public class GreatestNumber {
	public static void main(String args[]) {
		int num;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter elements into the array ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		max=arr[0];
		for(int i=0;i<num;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("The greatest element of array is : "+max);
		sc.close();
	}

}
