import java.util.Scanner;

public class SmallestNumber {
	public static void main(String args[]) {
		int num;
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter elements into the array ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		min=arr[0];
		for(int i=0;i<num;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The Smallest element of array is : "+min);
		sc.close();
	}

}


