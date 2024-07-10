package logicalPrograms;
import java.util.Scanner;
//Check a given number is Niven-number or not
/*
 * Niven-Number:
 * A positive number divisible by sum of its digit
 * Example: 24 
 * sum of digits(24)= 2+4 = 6 
 * 24 is divisible by 6 ==> Niven-Number
 */

public class CheckNiven {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		while(exit) {
			System.out.println("Enter Your Choice:");
			System.out.println("\n 1.Check Number Is Niven\n 2.Exit Program");
			int choice  = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				niven(num);				
				
			}
			break;
			
			case 2: {
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default : System.out.println("Invalid Choice ");
			}

			
		}

		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void niven(int number) {
		int originalNumber = number;
		System.out.println("Number is : "+number);
		System.out.println("Sum of Digits of "+number+" is :");
		int sumOfDigits = 0;
		while(number!=0) {
			sumOfDigits = sumOfDigits + (number%10);
			number = number/10;
			
		}
		System.out.println(sumOfDigits);
		if(originalNumber%sumOfDigits==0) {
			System.out.println(originalNumber+" is a Niven Number ");
			System.out.println("=======================================");
		}
		else {
			System.out.println("It is not a Niven Number ");
			System.out.println("=======================================");
		}
		
		
	}



}
