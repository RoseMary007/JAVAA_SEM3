package MODULE_1;
import java.util.*;
public class Calender {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int year;
		String month;
		int day=0;
		System.out.println("enter the year");
		year=sc.nextInt();
		System.out.println("enter the month");
		month=sc.next();
		switch(month.toUpperCase()) {
		case "JANUARY":case "MARCH":case "MAY":case "JULY":case "SEPTEMBER":case "NOVEMBER":
			day=31;
			break;
		case "APRIL":case "JUNE": case "AUGUST":case "OCTOBER" :case "DECEMBER":
			day=30;
			break;
		case "FEBRUARY":
			if((year%100==0 && year%4==0)||year%400==0)
				day=29;
			else
				day=28;
		    break;
		default:
			System.out.println("invalid month");
		}
		System.out.println(day+" "+month+" "+year);
	}
}
