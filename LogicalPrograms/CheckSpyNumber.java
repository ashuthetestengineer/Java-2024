package logicalPrograms;
import java.util.Scanner;

//Check a given number is Spy number or not?
/*
 * Spy Number : A positive number whose
 * sum of digits of numbers == product of digits of number
 * example: 123
 * sum of digits = 1+2+3 = 6 == Product of Digits = 1*2*3=6
 */
public class CheckSpyNumber {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Spy Number\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1 : {
				System.out.println("Enter the Number: ");
				int num = input.nextInt();
				spy(num);
			}
			break;
			case 2 : { exit = false;
				System.out.println("Program Exit Success ");
			}
			break ;
			
			default : System.out.println("Invalid Choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	public static void spy(int num) {
		int originalNumber = num;
		System.out.println("Number is : "+originalNumber);
		System.out.println("Sum Of Digits Of "+originalNumber +" is: ");
		//Finding Sum Of Digits Of Number
		int sumOfDigits = 0;
		int num2 = num;
		while(num2!=0) {
			sumOfDigits = sumOfDigits+(num2%10);
			num2 = num2/10;
		}
		System.out.println(sumOfDigits);
		//Finding Product Of Digits OF Number
		
		System.out.println("Product Of Digits Of "+originalNumber +" is: ");
		int product = 1;
		int num3 = num;
		while(num3!=0) {
			product = product *(num3%10);
			num3=num3/10;
		}
		System.out.println(product);
		
		if(sumOfDigits == product) {
			System.out.println(originalNumber + " is Spy Number ");
			System.out.println("=====================================");
		}
		else {
			System.out.println("It is not a SPY Number ");
			System.out.println("=====================================");
		}
	}

}
