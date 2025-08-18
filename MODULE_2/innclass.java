package MODULE_2;
import java.util.*;
class out1{
	int a;
	class in1{
		void display(int c) {
			a=c;
			System.out.println("a is "+a);
		}
	}
}
public class innclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:18.08.2025
         */
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("enter a number ");
        m=sc.nextInt();
        out1 obj=new out1();
        out1.in1 ob=obj.new in1();
        ob.display(m);
	}

}
