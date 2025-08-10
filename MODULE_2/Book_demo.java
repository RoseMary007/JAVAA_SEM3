package MODULE_2;
import java.util.*;
class Book{
	String author;
	String name;
	double price;
	Book(){
		author="unknown";
		name="unknown";
		price=0.0;
	}
	Book(String title){
		name=title;
		author="unknown";
		price=0.0;
	}
	Book(String title,String author,double price){
		name=title;
		this.author=author;
		this.price=price;
	}
	void display() {
		System.out.println("title is "+name);
		System.out.println("author is "+author);
		System.out.println("price is "+price);
	}
}
public class Book_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:10.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String author;
		String title;
		double price;
		Book ob=new Book();
		ob.display();
		System.out.println("enter the title of the bbok");
		title=sc.nextLine();
		Book ob1=new Book(title);
		ob1.display();
		System.out.println("enter the name of the book,author  of the book and price of the book");
		title=sc.nextLine();
		author=sc.nextLine();
		price=sc.nextDouble();
		Book ob2=new Book(title,author,price);
		ob2.display();
	}

}
