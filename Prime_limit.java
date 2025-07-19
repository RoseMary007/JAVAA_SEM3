package MODULE_1;
import java.util.*;
public class Prime_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
	        * Date:19.07.2025
	        */
		Scanner sc=new Scanner(System.in);
		int limit;
		int i;
		int j;
		int prime_no=0;
		System.out.println("enter your limit");
		limit=sc.nextInt();
		System.out.println("The prime numbers upto the limit are");
		for(i=2;i<=limit;i++) {
			for(j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					prime_no=1;
					break;
				}
			}
			if(prime_no==0)
				System.out.println(i);
			prime_no=0;
		}
		
	}

}
