package MODULE_1;
import java.util.*;
public class CountAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:31.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String s;
		int countVowels=0;
		int countConst=0;
		int length,i;
		System.out.println("enter a string");
		s=sc.nextLine();
		length=s.length();
		s=s.toLowerCase();
		for(i=0;i<=length-1;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				countVowels++;	
			}
			else if((s.charAt(i)>='b') && (s.charAt(i)<='z')) {
				countConst++;
			}
			else
				continue;
		}
		System.out.println("the number of vowels "+countVowels);
		System.out.println("the numbet of consonants "+countConst);
		
	}

}
