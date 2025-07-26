package MODULE_1;

import java.util.*;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter your limit");
		n=sc.nextInt();
		int []numbers=new int[n];
		System.out.println("enter your elements");
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println("the sorted array");
		for(int value:numbers)
		System.out.print(value+"\t");
	}

}
