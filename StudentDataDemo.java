package MODULE_1;
import java.util.*;
class StudentData{
	  String name;
	 int age;
	void display() {
		System.out.println("STUDENT DATA");
		System.out.println("NAME :"+name);
		System.out.println("ROLL NO :"+age);
	}
}
public class StudentDataDemo {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentData s1=new StudentData();
        String name;
        int age;
        System.out.println("enter student name and age");
        name=sc.nextLine();
        age=sc.nextInt();
        s1.name=name;
        s1.age=age;
        s1.display();
        sc.close();
	}

}
