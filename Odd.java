package MODULE_1;
import java.util.*;
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:24.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		System.out.println("enter the limit");
		n=sc.nextInt();
		System.out.println("Odd numbers are");
		for (i=1;i<=n;i++){
			if(i%2==0)
				continue;
			System.out.println(i);
		}
	}

}
