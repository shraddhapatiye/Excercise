import java.util.Scanner;

public class SecondLargest {
	public static void main(String args[]) {
		int num;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter elements into the array ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		int length=arr.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
System.out.println("Second Smallest element is: "+arr[length-2]);
sc.close();
}
}

