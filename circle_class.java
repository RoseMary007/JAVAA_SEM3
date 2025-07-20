package MODULE_1;
import java.util.*;
class circle{
	double r;
	double circumference() {
		return (2*3.14*r);
	}
	double area() {
		return (3.14*r*r);
	}
}
public class circle_class {
	public static void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
		 * DATE:20TH JULY,2025
		 */
		Scanner sc=new Scanner(System.in);
		circle c1=new circle();
		double radius;
		double circum;
		double areas;
		System.out.println("enter the radius");
		radius=sc.nextDouble();
		c1.r=radius;
		circum=c1.circumference();
		System.out.println("circumference of circle is "+circum);
	    areas=c1.area();
	    System.out.println("area of the circle is "+areas);
	}
	
}
