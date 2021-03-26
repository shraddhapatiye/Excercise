import java.util.Scanner;

public class ReverseArray {
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
		System.out.println("Reverse array:  ");
		for(int i=num-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		sc.close();
	}
}
