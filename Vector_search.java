package MODULE_1;
import java.util.*;
public class Vector_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:28.07.2025
         */
		Scanner sc=new Scanner(System.in);
		Vector<String> search=new Vector<>();
		String key;
		int f=0;
		search.add("pen");
		search.add("notebook");
		search.add("eraser");
		search.add("marker");
		System.out.println(search);
		System.out.println("enter an item");
		key=sc.next();
		key=key.toLowerCase();
		for(String i:search) {
			if(key.equals(i)) {
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println("Item found");
		else
			System.out.println("Item not found");
	}

}
