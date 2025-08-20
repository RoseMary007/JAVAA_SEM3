package MODULE_2;
import java.util.*;
public class Recursion_demo {
	int sum=0;
	int sumOfDigit(int number) {
		if(number!=0) {
		sum+=number%10;
		sumOfDigit(number/10);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:19.08.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int answer;
		System.out.println("enter a number");
		number=sc.nextInt();
		Recursion_demo ob=new Recursion_demo();
		answer=ob.sumOfDigit(number);
		System.out.println("the sum of digits is "+answer);
	}

}
