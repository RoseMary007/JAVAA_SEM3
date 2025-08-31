package MODULE_1;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:31.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String s,reverse;
		int length;
		System.out.println("enter the string");
		s=sc.nextLine();
		length=s.length();
		reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if(reverse.equals(s)) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
	}

}
