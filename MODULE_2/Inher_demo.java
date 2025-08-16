package MODULE_2;
import java.util.*;
class Employee{
	String name;
	String address;
	int age;
	int mob;
	float sal;
	
    void print_Salary(float sal) {
    	this.sal=sal;
    	System.out.println("Salary: "+sal);
    }
}
class Officer extends Employee{
	String spl;
	Officer(String name,String address,int age,int mob,float sal){
		this.name=name;
		this.address=address;
		this.age=age;
		this.mob=mob;
		this.sal=sal;
		System.out.println("--- Officer Details ---");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Mobile number: "+mob);
	}
	void print_specialization(String spl) {
		super.print_Salary(sal);
		this.spl=spl;
		System.out.println("specialization :"+spl);
	
	}
}
class Manager extends Employee{
	String dep;
	Manager(String name,String address,int age,int mob,float sal){
		this.name=name;
		this.address=address;
		this.age=age;
		this.mob=mob;
		this.sal=sal;
		System.out.println("--- Manager Details ---");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Mobile number: "+mob);
	}
	void print_dep(String dep){
		super.print_Salary(sal);
		this.dep=dep;
		System.out.println("Department:"+dep);
	}
}
public class Inher_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:16.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String spl;
		String dep;
		String name;
		String address;
		int age;
		int mob;
		float sal;
		System.out.println("enter the officer's name");
		name=sc.nextLine();
		System.out.println("enter the address");
		address=sc.nextLine();
		System.out.println("enter your age");
		age=sc.nextInt();
		System.out.println("enter the number");
		mob=sc.nextInt();
		System.out.println("enter salary");
		sal=sc.nextFloat();
		System.out.println("enter your specialization");
		sc.nextLine();
		spl=sc.nextLine();
		System.out.println("enter the Manager's name");
		name=sc.nextLine();
		System.out.println("enter the address");
		address=sc.nextLine();
		System.out.println("enter your age");
		age=sc.nextInt();
		System.out.println("enter the number");
		mob=sc.nextInt();
		System.out.println("enter salary");
		sal=sc.nextFloat();
		System.out.println("enter your department");
		sc.nextLine();
		dep=sc.nextLine();
		Officer ob=new Officer( name, address, age, mob,sal);
		ob.print_specialization(spl);
		
		Manager obj=new Manager( name, address, age, mob,sal);
		obj.print_dep(dep);
	}

}
