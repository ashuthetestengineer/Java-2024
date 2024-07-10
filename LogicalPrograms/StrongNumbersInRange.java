package logicalPrograms;
import java.util.Scanner;

//Find all strong numbers in a range
public class StrongNumbersInRange {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("====================================");
			System.out.println("Enter your Choice:");
			System.out.println("\n 1.Check Strong Number\n 2.Find Strong Numbers In Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the Number: ");
				int num = input.nextInt();
				boolean check = strong(num);
				if(check) {
					System.out.println(num+" Is a Strong Number ");
					System.out.println("===========================");
				}
				else {
					System.out.println(num+" Is a not a Strong number");
					System.out.println("===========================");
				}
				
			}break;
			
            case 2:{
            	System.out.println("Enter the start of Range: ");
            	int sRange = input.nextInt();
            	System.out.println("Enter the end Range: ");
            	int eRange = input.nextInt();
            	System.out.println("All Strong Numbers in the Given Range are: ");
            	System.out.println("===========================");
            	for(int i = sRange;i<=eRange;i++) {
            		if(strong(i)) {
            			System.out.println(i);
            		}
            	}
				
			}break;
			
            case 3: {
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
	
	public static boolean strong(int num) {
		int originalNumber=num;
		int lastDigit =0;
		int sumOfFactorial = 0;
		while(num>0) {
			lastDigit = num%10;
			sumOfFactorial +=factorial(lastDigit);
			num = num/10;
			
		}
		if(sumOfFactorial==originalNumber) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static int factorial(int digit) {
		int fact =1;
		for(int i=digit;i>=1;i--) {
			fact = fact*i;
		}
		
		return fact;
		
	}

}
