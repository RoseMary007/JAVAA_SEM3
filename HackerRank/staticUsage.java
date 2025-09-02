package HackerRank;
import java.util.*;
public class staticUsage {
	static    int B,H;
	static boolean flag;
	static{
	    Scanner sc=new Scanner(System.in);
    System.out.println("enter two values");
	H=sc.nextInt();
	B=sc.nextInt();
	if(H <=0||B<=0){
	    System.out.println("java.lang.Exception: Breadth and height must be positive");
	    flag=false;}
	else
	flag=true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
	        * Date:02.09.2025
	        */
				if(flag){
					int area=B*H;
					System.out.print(area);
				}
	}

}
