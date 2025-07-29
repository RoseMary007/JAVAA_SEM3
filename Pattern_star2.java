package MODULE_1;
import java.util.*;
public class Pattern_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:29.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.println("enter your limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
