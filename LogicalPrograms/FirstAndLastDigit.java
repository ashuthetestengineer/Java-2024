package logicalPrograms;
import java.util.Scanner;

//Find first and last digit of a number 
public class FirstAndLastDigit {
	public static void main(String [] args) {
		System.out.println("Main Start");
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		while(exit) {
			System.out.println("Enter the Choice: ");
			System.out.println("\n 1.Find First and Last Digit Of Number\n 2.Exit Program ");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				System.out.println("First And Last Digit Of "+num+" are ");
				firstAndLastDigit(num);				
				
			}
			break;
			
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			default: System.out.println("Program Exit Success");	
			
			
			}

			
			
			
		}
		
		System.out.println("Main Ends");
		input.close();
		
		
	}
	
	public static void firstAndLastDigit(int num) {
		//Last Digit 
		int originalNum = num;
		int lDigit = num%10;
		int fDigit=0;
		int count =0;
		//First Digit
		while(num!=0) {
		 fDigit = num%10;
		num = num/10;
		count++;
		}
		
		System.out.println("First Digit Of "+ originalNum+ " = "+fDigit);
		System.out.println("Last Digit Of "+ originalNum+ " = "+lDigit);
		System.out.println("Total Digits = "+count);
		
		
	}

}
