package MODULE_2;
import java.util.*;
class Person{
	String name;
	int age;
	String email;
	String Address;
	void display_personal_info() {
		System.out.println("name :"+name+" age :"+age+" email: "+email+" Address :"+Address);
	}
}
class Student extends Person{
	String major;
	void display_student_info(){
		System.out.println("major "+major);
	}
}
class Instructor extends Person{
	String subject;
	void display_instructor_info() {
		System.out.println("subject "+subject);
	}
}
public class Inheritence_demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		/**AUTHOR:Rose Mary Joe
         * Date:12.08.2025
         */
		String name;
		int age;
		String email;
		String Address;
		String major;
		String subject;
		Student ob=new Student();
		Instructor obj=new Instructor();
		System.out.println("enter student details liike name,age,address in a line ,email,major");
		name=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        Address=sc.nextLine();
        email=sc.nextLine();
        major=sc.nextLine();
        ob.name=name;
        ob.age=age;
        ob.Address=Address;
        ob.email=email;
        ob.major=major;
        ob.display_personal_info();
        ob.display_student_info();
        System.out.println("enter Instructor details liike name,age,address in a line ,email,subject");
		name=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        Address=sc.nextLine();
        email=sc.nextLine();
        subject=sc.nextLine();
        obj.name=name;
        obj.age=age;
        obj.Address=Address;
        obj.email=email;
        obj.subject=subject;
        obj.display_personal_info();
        obj.display_instructor_info();
	}
	
}
