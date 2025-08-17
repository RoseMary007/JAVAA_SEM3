package MODULE_2;
import java.util.*;
class Book1{
	String title;
	String author;
	Book1(String title,String author){
		this.title=title;
		this.author=author;
	}
	void display() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
	}
}
class Technical extends Book1{
	String Subject;
	Technical(String title,String author,String Subject){
		super(title,author);
		this.Subject=Subject;
		
	}
	void display() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("subject: "+Subject);
	}
}
class Story extends Technical{
	String genre;
	Story(String title,String author,String Subject,String genre){
		super(title,author,Subject);		
		this.genre=genre;
		
	}
	void display() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("subject: "+Subject);
		System.out.println("genre: "+genre);
	}
}
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**AUTHOR:Rose Mary Joe
         * Date:17.08.2025
         */
		Scanner sc=new Scanner(System.in);
		String title;
		String author;
		String Subject;
		String genre;
		int i;
		for(i=1;i<=3;i++) {
		System.out.println("enter the book name");
		title=sc.nextLine();
		System.out.println("enter the author name");
		author=sc.nextLine();
		if(i==1) {
			Book1 ob=new Book1(title,author);
			System.out.println("---BOOK DETAILS----");
			ob.display();
		}
		if(i==2) {
			System.out.println("enter the subject ");
			Subject=sc.nextLine();
			Technical obj=new Technical(title,author,Subject);
			System.out.println("---BOOK DETAILS----");
			obj.display();
		}
		if(i==3) {
			System.out.println("enter the subject ");
			Subject=sc.nextLine();
			System.out.println("enter the genre ");
			genre=sc.nextLine();
			Story obje=new Story(title,author,Subject,genre);
			System.out.println("---BOOK DETAILS----");
			obje.display();}
		}

	}

}
