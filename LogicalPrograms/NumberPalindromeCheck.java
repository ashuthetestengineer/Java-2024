package logicalPrograms;
import java.util.Scanner;

//Check  a number is palindrome or not 
public class NumberPalindromeCheck {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Palindrome\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				if(palindromeCheck(num)) {
					System.out.println(num+ " Is a Palindrome");
				}
				else {
					System.out.println("It is Not a Palindrome");
				}
			}
			break;
			case 2 :{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			default : System.out.println("Invalid choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	public static boolean palindromeCheck(int num) {
		int originalNumber = num;
		int rev =0;
		while(num>0) {
			int remainder = num%10;
			rev = rev*10+remainder;
			num = num/10;
			
			
		}
		System.out.println("Original Number : "+originalNumber);
		System.out.println("Reverse Of Number : "+rev);
		if(rev == originalNumber) {
			return true;
		}
		else return false;
		
	}

}
