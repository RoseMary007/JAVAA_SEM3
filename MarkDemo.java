package MODULE_1;
import java.util.*;
class Marks{
	double  mark1,mark2,mark3;
	Marks(double mark1,double mark2,double mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	double total() {
		return(mark1+mark2+mark3);
	}
	double average() {
		return((mark1+mark2+mark3)/3);
	}
}
public class MarkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:03.08.2025
         */
		Scanner sc=new Scanner(System.in);
		double m1,m2,m3;
		System.out.println("enter three marks");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		double sum;
		double avg;
		Marks ob=new Marks(m1,m2,m3);
		sum=ob.total();
		System.out.println("Total of all the marks are "+sum);
		avg=ob.average();
		System.out.println("Average of all the marks are "+avg);
	}

}
