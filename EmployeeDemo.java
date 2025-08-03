package MODULE_1;
import java.util.*;
class Employee{
	long empId;
	String empName;
	double salary;
	Employee(long empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void displayEmployee(){
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee name "+empName);
		System.out.println("Employee salary "+salary);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:03.08.2025
         */
		Scanner sc=new Scanner(System.in);
		int i;
		long id;
		String name;
		double salary;
		for(i=1;i<=2;i++) {
			System.out.println("enter the id,name and salary of employee "+i);
			id=sc.nextLong();
			sc.nextLine();
			name=sc.nextLine();
			salary=sc.nextDouble();
			Employee ob=new Employee(id,name,salary);
			ob.displayEmployee();
		}
	}

}
