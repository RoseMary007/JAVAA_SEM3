package MODULE_1;
import java.util.*;
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:31.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String s;
		char replaceChar;
		String newWord;
		System.out.println("ehter a string");
		s=sc.nextLine();
		System.out.println("enter the character which you have to replace with 'x'");
		replaceChar=sc.next().charAt(0);
		newWord=s.replace(replaceChar,'x');
		System.out.println("the word without replacing "+s);
		System.out.println("the word after replacing "+newWord);
	}

}
