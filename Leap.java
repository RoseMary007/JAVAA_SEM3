package MODULE_1;
import java.util.*;
public class Leap {
	public static void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
         * Date:19.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter the year");
		year=sc.nextInt();
		if((year%4==0 && !(year%100==0))||year%400==0)
				System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}
