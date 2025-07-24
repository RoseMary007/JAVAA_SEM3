package MODULE_1;
import java.util.*;
public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int sum=0;
		System.out.println("enter a four digit number");
		number=sc.nextInt();
		while(number!=0) {
			sum+=number%10;
			number/=10;
		}
		System.out.println("the sum pf the digits are "+sum);
	}

}






