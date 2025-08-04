package MODULE_1;
import java.util.*;
class Employee1{
	long empId;
	String empName;
	double salary;
	Employee1(long empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void displayEmployee(){
		System.out.println(empId+"      "+empName+"      "+salary);
	}
}
public class Employee_Demo_for_n_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:04.08.2025
         */
		Scanner sc=new Scanner(System.in);
		int limit;
		int i;
		long id;
		String name;
		double salary;
		System.out.println("enter the count of employee");
		limit=sc.nextInt();
		Employee1[] ob=new Employee1[limit];
		for(i=0;i<limit;i++) {
			System.out.println("enter the id,name and salary of employee "+i+1);
			id=sc.nextLong();
			sc.nextLine();
			name=sc.nextLine();
			salary=sc.nextDouble();
			ob[i]=new Employee1(id,name,salary);
		}
		System.out.println("----EMPLOYEE DETAILS----");
		System.out.println("    ID     Name     Salary ");
		for(i=0;i<limit;i++) {
			ob[i].displayEmployee();
		}
	}

}

