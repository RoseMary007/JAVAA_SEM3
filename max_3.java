package MODULE_1;
import java.util.*;
public class max_3 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int number1,number2,number3;
		int large;
		System.out.println("enter three numbers");
		number1=in.nextInt();
		number2=in.nextInt();
		number3=in.nextInt();
		if(number1>number2) {
			if(number1>number3)
				large=number1;
			else
				large=number3;
		}
		else {
			if(number2>number3)
				large=number2;
			else
				large=number3;
		}
		System.out.println("largest is: "+large);
	}
}
