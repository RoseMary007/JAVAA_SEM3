package MODULE_2;
import java.util.*;
class Peri{
	int side;
	double radius;
	int height_triangle;
	int base_triangle;
	int[] traperi=new int[4];
	void perimeter(int side) {
		this.side=side;
		System.out.println("Perimeter of square is "+side*4);
	}
	void perimeter(double radius) {
		this.radius=radius;
		System.out.println("perimeter of circle"+2*3.14*radius);
	}
	void perimeter(int height,int base) {
		height_triangle=height;
		base_triangle=base;
		System.out.println("Perimeter of a triangle is"+0.5*height_triangle*base_triangle);
	}
	void perimeter(int[] traperi) {
		this.traperi=traperi;
        int peri=0;
		for(int i=0;i<4;i++) {
			peri+=traperi[i];
		}
		System.out.println("Perimeter of trapezium is "+peri);
	}
}
public class Perimeter_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:10.08.2025
         */
        Scanner sc=new Scanner(System.in);
        int side;
    	double radius;
    	int height;
    	int base;
    	int[] traperi=new int[4];
        Peri ob=new Peri();
        System.out.println("enter the side of square");
        side=sc.nextInt();
        ob.perimeter(side);
        System.out.println("enter the radius of circle ");
        radius=sc.nextDouble();
        ob.perimeter(radius);
        System.out.println("enter the height and base length of triangle");
        height=sc.nextInt();
        base=sc.nextInt();
        ob.perimeter(height,base);
        System.out.println("enter the four sides of trapezium");
        for(int i=0;i<4;i++) {
        	traperi[i]=sc.nextInt();
        }
        ob.perimeter(traperi);
	}

}
