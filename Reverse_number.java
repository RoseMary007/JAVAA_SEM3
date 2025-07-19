package MODULE_1;
import java.util.*;
public class Reverse_number {
	public static  void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
         * Date:19.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int i;
		int reverseNumber=0;
		System.out.println("enter a number");
		number=sc.nextInt();
		for(i=number;i!=0;i=i/10) {
			reverseNumber=reverseNumber*10+(i%10);
		}
		System.out.println("the reverse of "+number+"is "+reverseNumber);
	}
}
