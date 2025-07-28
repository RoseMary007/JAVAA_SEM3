package MODULE_1;
import java.util.*;
public class Vector_fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:28.07.2025
         */
		Scanner sc=new Scanner(System.in);
		Vector<String> fruits=new Vector<>();
		System.out.println("Enter the name of five fruits");
		for(int i=0;i<5;i++)
			fruits.add(sc.next());
		for(String print:fruits)
			System.out.println(print);
	}

}
