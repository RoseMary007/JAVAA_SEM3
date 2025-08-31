package MODULE_1;
import java.util.*;
public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:31.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String s;
		int length,i,j;
		int f=0;
		System.out.println("enter a string");
		s=sc.nextLine();
		length=s.length();
		for(i=0;i<=length-1;i++) {
			f=0;
			for(j=0;j<=length-1;j++) {
				if(s.charAt(i)==s.charAt(j)&&j!=i) {
					f=1;
					break;
				}
			}
			if(f==0) {
				break;
			}
		}
		if(f==0) {
			System.out.println("the non repeated character is "+s.charAt(i));
		}
		else {
			System.out.println("None");
		}
	}

}
