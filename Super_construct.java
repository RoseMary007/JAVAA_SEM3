package MODULE_2;
class AAA{
	int a,b;
	AAA(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class BBB extends AAA {
	int c;
	BBB(int a,int b,int c){
		super(a,b);
		this.c=c;
	}
	void display() {
		System.out.println(a+" "+b+" "+c);
	}
	
}
public class Super_construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:16.08.2025
         */
		BBB ob=new BBB(5,9,7);
		ob.display();
	}

}
