package MODULE_1;
import java.util.*;
public class attendence {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int attendencePercentage;
		float mark;
		System.out.println("enter your attendence percentage ");
		attendencePercentage=sc.nextInt();
		if(attendencePercentage>=90)
			System.out.println("your mark:10");
		else
		{
			mark=attendencePercentage/10;
			System.out.println("your mark:"+mark);
		}
	}
	
}
