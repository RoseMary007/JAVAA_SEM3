package MODULE_1;
import java.util.*;
class Circle{
	double radius;
	Circle(double rad){
		radius=rad;
	}
	double area(){
		return(3.14*radius*radius);
	}
	double circumference() {
		return(2*3.14*radius);
	}
	
}
public class CircleDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:03.08.2025
         */
		Scanner sc=new Scanner(System.in);
		double radius;
		System.out.println("enter the radius of the circle");
		radius=sc.nextDouble();
		Circle ob=new Circle(radius);
		System.out.println("AREA IS "+ob.area());
		System.out.println("CIRCUMFERENCE IS "+ob.circumference());
	}

}
