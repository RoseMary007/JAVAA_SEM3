package MODULE_1;
import java.util.*;
public class Array_input {
	public static void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int[] numbers=new int[n];
		System.out.println("enter your elements");
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("Elements of the array:");
		for(int value:numbers) {
			System.out.print(value+"\t");
		}
		System.out.print("\n");
		System.out.println("elements of the array in reverse order ");
		for(i=n-1;i>=0;i--)
			System.out.print(numbers[i]+"\t");
	}
}
