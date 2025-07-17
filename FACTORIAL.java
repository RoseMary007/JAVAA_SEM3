package MODULE_1;
import java.util.*;
public class FACTORIAL {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number;
		int fact=1;
		System.out.println("enter the number");
		number=sc.nextInt();
		while(number!=0) {
			fact*=number;
			number--;
		}
		System.out.println("Factorial: "+fact);
	}
}
