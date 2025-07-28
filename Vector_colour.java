package MODULE_1;
import java.util.*;
public class Vector_colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/**AUTHOR:Rose Mary Joe
		         * Date:28.07.2025
		         */
		Vector<String> colour=new Vector<>();
		colour.add("Red");
		colour.add( "Green");
		colour.add("Blue");
		colour.add("Yellow");
		System.out.println("vector befor removing green "+colour);
		colour.remove(1);
		System.out.println("vector after removing green "+colour);
	}

}
