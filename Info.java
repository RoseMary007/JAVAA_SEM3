package MODULE_1;
import java.util.*;
public class Info {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		double CGPA;
		long phoneNumber;
		System.out.println("enter your name");
		name=sc.nextLine();
		System.out.println("enter your age");
		age=sc.nextInt();
		System.out.println("enter your CGPA");
		CGPA=sc.nextDouble();
		System.out.println("enterr your phone number");
		phoneNumber=sc.nextLong();
		System.out.println("YOUR NAME :"+name+" YOUR AGE :"+age+" YOUR CGPA :"+CGPA+" YOUR PHONE NUMBER :"+phoneNumber);
	}
}
