package MODULE_1;
import java.util.*;
class StudentData1{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String myname) {
        name = myname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int myage) {
        if (myage > 0) {
            age = myage;
        }
    }
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        StudentData1 s1=new StudentData1();
        String name1;
        int age1;
        System.out.println("enter name and age");
        name1=sc.nextLine();
        age1=sc.nextInt();
        s1.setName(name1);
        s1.setAge(age1);
        System.out.println("name is "+s1.getName());
        System.out.println("age is "+s1.getAge());
	}

}
