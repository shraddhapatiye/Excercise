import java.util.Scanner;

public class AscendingArray {

	public static void main(String args[]) {
		int num,temp=0;
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
		System.out.println("Ascending order elements ");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]+"");
	
		}
		sc.close();
}
	
}
