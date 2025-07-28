package MODULE_1;

import java.util.Vector;

public class Vector_maximum {
	public static void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
         * Date:28.07.2025
         */
		Vector<Integer> max=new Vector<>();
		int maximum;
		int i;
		int value;
		max.add(25);
		max.add(16);
		max.add(15);
		max.add(80);
		max.add(45);
		System.out.println(max);
		maximum=max.get(0);
		for(i=1;i<5;i++) {
			value=max.get(i);
			if(value>maximum)
				maximum=value;
		}
		System.out.println("the maximum value is "+maximum);
	}

}
