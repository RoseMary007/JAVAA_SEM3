package MODULE_1;
import java.util.*;
public class Vector_demp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<String> mammals=new Vector<>();
        Vector<String> animals=new Vector<>();
        mammals.add("DOG");
        mammals.add("horse");
       mammals.add(2,"CAT");
       animals.add("CAMEL");
       animals.addAll(mammals);
       System.out.println("vector of animals is "+animals);
       System.out.println("vector is "+mammals);
       String element=mammals.get(2);
       System.out.println("removed element is "+element);
       mammals.remove(2);
       System.out.println(mammals);
       mammals.clear();
       System.out.println(mammals);
       
	}

}
