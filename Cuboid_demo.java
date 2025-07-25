package MODULE_1;
import java.util.*;
public class Cuboid_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/**AUTHOR:Rose Mary Joe
			        * Date:25.07.2025
			        */
				Scanner sc=new Scanner(System.in);
				Cuboid c1=new Cuboid();
				double length,breadth,height;
				System.out.println("enter the length,breadth,height of the cuboid");
				length=sc.nextDouble();
				breadth=sc.nextDouble();
				height=sc.nextDouble();
				c1.setDimension(length,breadth,height);
				double volume=c1.Volume();
				double surfaceArea=c1.SurfaceArea();
			    System.out.println("volume is "+volume);
			    System.out.println("surface area is "+surfaceArea);
			    
			}

		}
