package logicalPrograms;
import java.util.Scanner;

//Check a number is a strong number or not
/*
 * STRONG NUMBER:
 * If Sum of factorial of each digit of a number is equal to the original number 
 * Then it is Strong Number
 * Number = 123
 * Sum of Factorial Of Each Digit
 * 3!+2!+1! = 6+2+1=9 not equal to 123
 * So not a strong number
 * 
 */

public class CheckStrong {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("======================================");
			System.out.println("Enter Your choice:");
			System.out.println("\n 1.Check Strong Number\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the Number:");
				int num = input.nextInt();
				strongNumber(num);
			}
			break;
			case 2:{
				exit =false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default: System.out.println("Invalid choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void strongNumber(int num) {
		int originalNumber = num;
		int lastDigit =0;
		int sumOfFactorial =0;
		
		while(num>0) {
			lastDigit = num%10;
			sumOfFactorial += factorial(lastDigit);
			num =num/10;
			
		}
		System.out.println("Number is : "+originalNumber);
		System.out.println("Sum of Factorial Of Each Digit: "+sumOfFactorial);
		if(sumOfFactorial==originalNumber) {
			System.out.println(originalNumber+" is a STRONG NUMBER ");
			System.out.println("======================================");
		}
		else {
			System.out.println("It is Not A Strong Number ");
		}
		
	}
	
	
	public static int factorial(int digit) {
		int fact =1;
		for(int i =digit;i>=1;i--) {
			fact = fact*i;
			
		}
		return fact;
		
	}

}
