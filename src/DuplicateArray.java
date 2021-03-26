import java.util.Scanner;

public class DuplicateArray {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		num = sc.nextInt();

		int arr[] = new int[num];
		System.out.println("Enter elements into the array ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;i++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		sc.close();
}
}