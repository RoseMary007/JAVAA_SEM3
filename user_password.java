package MODULE_1;
import java.util.*;
public class user_password {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String userName;
		String password;
		System.out.println("enter the user name");
		userName=sc.next();
		System.out.println("enter the password");
		password=sc.next();
		if(userName.equals("rose") && password.equals("123"))
			System.out.println("welcome to the portal");
		else if(userName.equals("rose")&&!password.equals("123"))
			System.out.println("Incorrect password");
		else if(!userName.equals("rose")&&password.equals("123"))
			System.out.println("incorrect user name");
		else if(!userName.equals("rose")&&!password.equals("123"))
			System.out.println("incorrect user name and password");
		else
			System.out.println("please enter the fields");
	}
}
