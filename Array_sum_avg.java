package MODULE_1;
import java.util.*;
public class Array_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i;
		int sum=0;
	    double average;
		System.out.println("enter your limit");
		n=sc.nextInt();
		int []numbers=new int[n];
		System.out.println("enter your array elements");
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int value:numbers) {
			sum+=value;
		}
		average=(double)sum/(double)n;
		System.out.println("sum is "+sum);
		System.out.println("Average is "+average);
	}

}
