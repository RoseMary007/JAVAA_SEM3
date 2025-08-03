package MODULE_1;
import java.util.*;
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayBook(){
		System.out.println("Title is "+title);
		System.out.println("Author is "+author);
		System.out.println("Price is "+price);
	}
}
public class Book_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:03.08.2025
         */
		Scanner sc=new Scanner(System.in);
		int i;
		String title;
		String author;
		double price;
		for(i=1;i<=2;i++) {
			System.out.println("enter the title,author,price of book"+i);
			title=sc.nextLine();
            author=sc.nextLine();
            price=sc.nextDouble();
            sc.nextLine();
            Book ob=new Book(title,author,price);
            ob.displayBook();
		}
	}

}
