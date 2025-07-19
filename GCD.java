package MODULE_1;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:19.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number1;
		int number2;
		int temp=0;
		System.out.println("enter two numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		while(number2!=0)
		{
			temp=number1 % number2;
		     number1=number2;
		     number2=temp;
		}
		System.out.println("the GCD of numbers is "+number1);
	}

}
