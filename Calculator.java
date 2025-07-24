package MODULE_1;
import java.util.*;
class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number1;
		int number2;
		char operator;
		System.out.println("enter two numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		System.out.println("enter the operator");
		operator=sc.next().charAt(0);
		switch (operator){
		case '+':
			System.out.println("sum is "+(number1+number2));
		    break;
		case '-':
			System.out.println("difference is "+(number1-number2));
			break;
		case '*':
			System.out.println("product is "+(number1*number2));
			break;
		case '/':
			System.out.println("quotient is "+(number1/number2));
			break;
		default:
			System.out.println("wrong input");
		}
		}

}
