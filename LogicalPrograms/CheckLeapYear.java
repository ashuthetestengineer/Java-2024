package logicalPrograms;
import java.util.Scanner;

//Find a given year is a leap year or not
/*
 * Leap Year:
 * case 1: year is completely divisible by 4 --> year %4 == 0
 * case 2: Every century year is not a leap year --> year %100!= 0
 * case 3: Century year after every 400 year is leap year --> year %400 == 0
 * CONCLUSION : 
 * Leap Year = (Divisible by 4 AND not divisible by 100) OR (Year Divisible by 400) 
 */
public class CheckLeapYear {
	public static void main(String [] rags) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Leap Year\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1 :{
				System.out.println("Enter the Year: ");
				int year = input.nextInt();
				checkLeap(year);
			}
			break;
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break; 
			default : System.out.println("Invalid Choice");
			
			}
			
		}
		
		System.out.println("Main Ends");
		input.close();
	}
	public static void checkLeap(int year) {
		System.out.println("Year is : "+year);
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("It is a Leap Year");
		}
		else {
			System.out.println("It is not a Leap Year");
		}
		
	}
	

}
