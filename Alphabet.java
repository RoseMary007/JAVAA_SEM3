package MODULE_1;
import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
		char letter;
		System.out.println("enter a character");
		letter=sc.next().charAt(0);
		if(Character.isLetter(letter)) {
			switch (Character.toUpperCase(letter)){
			case 'A':case 'E':case 'I':case 'O':case 'U':
				System.out.println("the character is a vowel");
				break;
			default:
				System.out.println("the character is a consonant");
		}
		}
		else
			System.out.println("enter a valid letter");
	}
}
