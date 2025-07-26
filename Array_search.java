package MODULE_1;
import java.util.*;
public class Array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:26.07.2025
         */
		Scanner sc=new Scanner(System.in);
		int n,i;
		int key;
		int value;
		System.out.println("enter your limit");
		n=sc.nextInt();
		int numbers[]=new int[n];
		System.out.println("enter your array elements");
		for(i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("enter your search element");
		key=sc.nextInt();
		Arrays.sort(numbers);
		value=Arrays.binarySearch(numbers,key);
		if(value<0)
			System.out.println("Element not found");
		else
			System.out.println(key+" is found at index in the sorted array is  "+value);
	}

}
