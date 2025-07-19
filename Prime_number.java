package MODULE_1;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**AUTHOR:Rose Mary Joe
         * Date:19.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int number;
		int prime_no=0;
		int i;
		System.out.println("enter a number");
		number=sc.nextInt();
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0) {
				prime_no=1;
				break;
			}
		}
		if(prime_no==0)
			System.out.println("the number "+number+" is a prime number");
		else
			System.out.println("the number "+number+" is not a prime number");
	}

}
