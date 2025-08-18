package MODULE_2;
class out{
	int a;
	void test() {
		in ob=new in();
		ob.display(20);
	}
	class in{
		void display(int c) {
			a=c;
			System.out.println("a is "+a);
		}
	}
}
public class Inclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:18.08.2025
         */
		out obj=new out();
		obj.test();

}
}