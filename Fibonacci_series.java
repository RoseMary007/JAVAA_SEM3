package MODULE_1;
import java.util.*;
public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:19.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int a=0;
		int b=1;
		int fibonacci=0;
		System.out.println("enter the limit");
        number=sc.nextInt();
        System.out.println("The fibonacci series are");
		while(fibonacci<=number) {
			System.out.println(fibonacci);
			fibonacci=a+b;
			b=a;
			a=fibonacci;
		}
	}

}
