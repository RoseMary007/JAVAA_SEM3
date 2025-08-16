package MODULE_2;
class AA{
	void say() {
		System.out.println("I love programming");
	}
}
class BB extends AA{
	void say() {
		System.out.println("I love JAVA");
		super.say();
	}
}
class CC extends BB{
	void say() {
		System.out.println("JAVA IS FUN");
		super.say();
	}
}
public class Super_method {
	public static void main(String args[]) {
		/**AUTHOR:Rose Mary Joe
         * Date:12.08.2025
         */
		CC ob=new CC();
		ob.say();
	}
}
