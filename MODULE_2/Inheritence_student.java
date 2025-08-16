package MODULE_2;
import java.util.*;
class Students{
	String name;
	int rollNo;
	String course;
	void set(String name,int rollNo,String course){
		this.name=name;
		this.rollNo=rollNo;
		this.course=course;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollNo);
		System.out.println("course: "+course);
	}
}
class StudentAccount extends Students{
	double collegeFee;
	void set(String name,int rollNo,String course,double collegeFee) {
		super.set(name, rollNo, course);
		this.collegeFee=collegeFee;
	}
	void display() {
		super.display();
		System.out.println("College Fee:"+collegeFee);
	}
}
class Hosteller extends StudentAccount{
	double hostelFee;
	double messFee;
	double total_hostel;
	void set(String name,int rollNo,String course,double collegeFee,double hostelFee,double messFee) {
		super.set(name,rollNo,course,collegeFee);
		this.hostelFee=hostelFee;
		this.messFee=messFee;
	}
	void display() {
		System.out.println("--- HOSTELLER DETAILS ---");
        super.display();
        System.out.println("Hostel fee: "+hostelFee);
        System.out.println("Mess fee:"+messFee);
        total_hostel=hostelFee+messFee+collegeFee;
        System.out.println("total fee:"+total_hostel);
	}
}
class DayScholar extends StudentAccount{
	double busFee;
	double total_dayscholar;
	void set(String name,int rollNo,String course,double collegeFee,double busFee) {
		super.set(name,rollNo,course,collegeFee);
		this.busFee=busFee;
	}
	void display() {
		System.out.println("--- DAY SCHOLAR DETAILS ---");
		super.display();
		System.out.println("Bus fee: "+busFee);
		total_dayscholar=busFee+collegeFee;
		System.out.println("total fee: "+total_dayscholar);
	}
}
public class Inheritence_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:16.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String name;
		int rollNo;
		String course;
		double collegeFee;
		double hostelFee;
		double messFee;
		double busFee;
		System.out.println("enter the hosteller's name");
		name=sc.nextLine();
		System.out.println("enter the roll no:");
		rollNo=sc.nextInt();
		System.out.println("enter the course name");
		sc.nextLine();
		course=sc.nextLine();
		System.out.println("enter the college fee");
		collegeFee=sc.nextDouble();
		System.out.println("enter the hostel fee");
		hostelFee=sc.nextDouble();
		System.out.println("enter the messs fee");
		messFee=sc.nextDouble();
		Hosteller ob=new Hosteller();
		ob.set( name, rollNo, course,collegeFee,hostelFee, messFee);
		System.out.println("enter the dayscholar's name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("enter the roll no:");
		rollNo=sc.nextInt();
		System.out.println("enter the course name");
		sc.nextLine();
		course=sc.nextLine();
		System.out.println("enter the college fee");
		collegeFee=sc.nextDouble();
		System.out.println("enter the bus fee");
		busFee=sc.nextDouble();
		DayScholar obj=new DayScholar();
		obj.set(name, rollNo, course,collegeFee,busFee);
		ob.display();
		obj.display();
		
	}

}
