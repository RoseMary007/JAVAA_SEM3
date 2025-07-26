package MODULE_1;
import java.util.*;
public class Array_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		int countEven=0,countOdd=0;
		System.out.println("enter your limit");
		n=sc.nextInt();
		int []number=new int[n];
		System.out.println("Enter your numbers");
		for(i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		for(int value:number) {
			if(value%2==0)
				countEven++;
			else
		        countOdd++;    		
		}
		System.out.println("Even numbers count is "+countEven);
		System.out.println("odd number count is "+countOdd);
	}

}
