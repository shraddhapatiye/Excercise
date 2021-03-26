import java.util.Scanner;

public class SecondSmallest {
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
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
System.out.println("Second Smallest element is: "+arr[1]);
sc.close();
}
}