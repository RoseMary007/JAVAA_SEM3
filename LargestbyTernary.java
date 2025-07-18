package MODULE_1;
import java.util.*;
public class LargestbyTernary {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number1;
		int number2;
		int large;
		System.out.println("enter two numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		large=(number1>number2?number1:number2);
		System.out.println("the largest is: "+large);
	}
}
