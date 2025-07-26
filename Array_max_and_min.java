package MODULE_1;
import java.util.*;
public class Array_max_and_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i;
		int maximum;
		int minimum;
		System.out.println("Enter your limit");
		n=sc.nextInt();
		System.out.println("enter your elements");
		int[] numbers=new int[n];
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		Arrays.sort(numbers);
		maximum=numbers[n-1];
		minimum=numbers[0];
		System.out.println("Maximum number is "+maximum);
		System.out.println("minimum number is "+minimum);
		
	}

}
