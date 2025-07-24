package MODULE_1;
import java.util.*;
public class Fibbnoacci_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
	    int n;
		int a=0,b=1;
		int fibonacci=0;
		int i;
		System.out.println("Enter the limit of numbers you want");
		n=sc.nextInt();
		System.out.println("fibonacci series:");
		for(i=1;i<=n;i++) {
			System.out.println(fibonacci);
			fibonacci=a+b;
			b=a;
			a=fibonacci;
		}
	}

}
