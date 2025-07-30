package MODULE_1;
import java.util.*;
public class Array_ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:30.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter your limit");
		n=sc.nextInt();
		Integer[] numbers=new Integer[n];
		System.out.println("enter the values of array");
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();	
		}
		Arrays.sort(numbers,Collections.reverseOrder());
		for(int value:numbers) {
			System.out.print(value+" ");
		}
	}

}
