package MODULE_1;
import java.util.*;
public class Pattern_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:29.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter your limit");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				 System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
