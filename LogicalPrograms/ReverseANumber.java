package logicalPrograms;
import java.util.Scanner;
//Reverse a Number.  example: 234 --> 432
//Same Logic applies for Number palindrome
public class ReverseANumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Reverse a Number\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				reverse(num);
			}
			break;
			case 2: {
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
	
	public static void reverse(int num) {
		System.out.println("Original Number is : "+num);
		System.out.println("Reverse Of Number is : ");
		int rev = 0;
		while(num>0) {
			int remainder = num%10;
			rev = rev*10 +remainder;
			num = num/10;
			
		}
		System.out.println(rev);
		System.out.println("==================================");
		
	}

}
