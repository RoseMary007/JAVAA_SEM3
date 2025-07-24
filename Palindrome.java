package MODULE_1;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int temp;
		int reverseNumber=0;
		System.out.println("enter your number");
		number=sc.nextInt();
		temp=number;
		while(temp!=0) {
			reverseNumber=reverseNumber*10+(temp%10);
			temp/=10;
		}
		if(number==reverseNumber)
			System.out.println(number+" is palindrome number");
		else
			System.out.println(number+" is not a palindrome number");
		}

}
