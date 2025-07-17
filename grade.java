package MODULE_1;
import java.util.*;
public class grade {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double mark;
	char grades;
	System.out.println("enter your mark");
	mark=sc.nextDouble();
    if(mark>90)
    	grades='s';
    else if(mark<90 && mark>80)
    	grades='A';
    else if(mark <80 && mark>70)
    	grades='B';
    else if(mark<70 &&mark>60)
    	grades='C';
    else if(mark<60 && mark>50)
    	grades='D';
    else if(mark<50 && mark>40)
    	grades='E';
    else
    	grades='F';
    System.out.println(grades);
}
}