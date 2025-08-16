package MODULE_2;
class A{
	int data=50;
}
class B extends A{
	int data=100;
	void say() {
		System.out.println(data);
		System.out.println(super.data);
	}
}
public class Super_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B ob=new B();
        ob.say();
	}

}
