package MODULE_1;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:31.08.2025
         */
        Scanner sc=new Scanner(System.in);
        String s,reverse;
        int length;
        System.out.println("enter a string");
        s=sc.nextLine();
        length=s.length();
        reverse="";
        for(int i=length-1;i>=0;i--) {
        	reverse=reverse+s.charAt(i);
        }
        System.out.println("The reverse of the string is "+reverse);
	}

}