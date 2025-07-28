package MODULE_1;
import java.util.*;
public class Vector_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:28.07.2025
         */
		Vector<Integer> sum=new Vector<>();
		int sumTotal=0;
		sum.add(10);
		sum.add(20);
		sum.add(30);
		sum.add(40);
		sum.add(50);
		System.out.println(sum);
		for(int i:sum)
			sumTotal+=i;
		System.out.println("The total sum is "+sumTotal);
	}

}
