package logicalPrograms;
import java.util.Scanner;

// Find the sum of even digits and sum of odd digits of a number 
public class SumOfEvenDigits {
	public static void main (String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice:");
			System.out.println("\n 1.Find Sum\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter The Number");
				int num = input.nextInt();
				findSum(num);
			}
			break;
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			default: System.out.println("Invalid Choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	public static void findSum(int num) {
		int evenSum =0;
		int oddSum = 0;
		int rem =0;
		while(num>0) {
			rem = num%10;
			if(rem%2==0) {
				evenSum+=rem;
			}
			else {
				oddSum+=rem;
			}
			num =num/10;
		}
		System.out.println("Sum Of Even Digits: "+evenSum);
		System.out.println("Sum Of ODD Digits: "+oddSum);
		System.out.println("==================================");
		
	}

}
