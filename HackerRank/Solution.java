package HackerRank;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
	        * Date:02.09.2025
	        */
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter n number of sentences");
        int num=1;
        String s;
        while(sc.hasNextLine()){//for knowing EOF
            s=sc.nextLine();
            System.out.println(num+" "+s);
            num++;
        }
	}

}
