package MODULE_2;
class Bird{
	void fly() {
		System.out.println("BIRDS FLY WITH THEIR WINGS ");
	}
}
class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow flies short distances.");
	}
}
class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle soars high in the sky");
	}
}
public class Bird_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:17.08.2025
         */
		Bird ob;
		ob=new Bird();
		ob.fly();
		ob=new Sparrow();
		ob.fly();
		ob=new Eagle();
		ob.fly();
	}

}
