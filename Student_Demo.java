package MODULE_1;
import java.util.*;
class Student{
	String name;
	long registerNumber;
	String course;
	int[] mark=new int[6];
	int total=0;
	int rank;
	Student(String name,long registerNumber,String course,int rank,int[] mark){
		this.name=name;
		this.registerNumber=registerNumber;
		this.course=course;
		this.rank=rank;
		this.mark=mark;
		this.total=total();//due to mark being over writing
	}
	int total() {
		total=0;
		for(int i=0;i<6;i++)
			total+=mark[i];
		return(total);
	}
	void display() {
		System.out.println(name+"   "+registerNumber+"   "+course+"    "+total+"    "+rank);
	}
	
}
public class Student_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:07.08.2025
         */
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        String name;
        long registerNumber;
        String course;
        System.out.println("enter the number of students");
        n=sc.nextInt();
        int[] mark=new int[6];
        Student[] ob=new Student[n];
        for(i=0;i<n;i++) {
        	System.out.println("enter the details of student "+(i+1));
        	System.out.println("Enter your name");
        	sc.nextLine();
        	name=sc.nextLine();
        	System.out.println("enter your register number");
        	registerNumber=sc.nextLong();
        	System.out.println("enter the course name");
        	sc.nextLine();
        	course=sc.nextLine();
        	System.out.println("enter the marks of 6 subjets");
        	for(j=0;j<6;j++) {
        		mark[j]=sc.nextInt();
        	}
        	ob[i]=new Student(name,registerNumber,course,i+1,mark);
        }
        for(i=0;i<n;i++) {
        	ob[i].display();
        }

	}

}
