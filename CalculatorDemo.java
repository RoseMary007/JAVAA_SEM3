package MODULE_1;
import java.util.*;
public class CalculatorDemo {
	public static void main(String args[]) {
		/**AUTHOR:ROSE MARY JOE
	        * DATE:31-07-2025
	        */
		Scanner sc=new Scanner(System.in);
		char option='Y';
		int n;
		double number1;
		double number2;
		double calculation;
		while(option=='Y'||option=='y') {
			System.out.println("--- Calculator Menu ---");
		System.out.println("Enter 1 for addition,2 for subtraction,3 for multiplication and 4 for division");
		n=sc.nextInt();
		System.out.println("enter two numbers");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		MyCalculator c1=new MyCalculator(number1,number2);
		switch(n) {
		case 1:
			calculation=c1.add();
			System.out.println("Sum is "+calculation);
			break;
		case 2:
			calculation=c1.subtract();
			System.out.println("Difference is "+calculation);
			break;
		case 3:
			calculation=c1.multiply();
			System.out.println("Product is "+calculation);
			break;
		case 4:
			if(number2==0)
				System.out.println("cannot divide enter a different number");
			else {
			     calculation=c1.divide();
			     System.out.println("The quotient is "+calculation);}
			break;
		default:
			System.out.println("enter a number between 1 and 4");
		}
		System.out.println("type 'Y'(yes) if you wish to continue or else type 'N'(no)");
		option=sc.next().charAt(0);
		System.out.print("\n");
		if(option =='N'||option=='n')
			System.out.println("THANK YOU FOR USING THE CALCULATOR");
		}
	}

}
class MyCalculator{
	double number1;
	double number2;
	MyCalculator(double n1,double n2){
		number1=n1;
		number2=n2;
	}
	double add() {
		return(number1+number2);
	}
	double subtract() {
		return (number1-number2);
	}
	double multiply() {
		return (number1*number2);
	}
	double divide() {
		return (number1/number2);
	}
}

