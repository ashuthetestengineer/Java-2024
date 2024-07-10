package logicalPrograms;
import java.util.Scanner;
//Find Factorial of all the numbers in a given range
public class FactorialInRange {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("========================================");
			System.out.println("Enter your choice: ");
			System.out.println("\n 1.Find Factorial of a Number\n 2.Find Factorial In a Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the number: ");
				int num = input.nextInt();
				factorial(num);
			}
			break;
			
			case 2:{
				System.out.println("Enter the start of Range: ");
				int sRange = input.nextInt();
				
				System.out.println("Enter the End of Range: ");
				int eRange = input.nextInt();
				System.out.println("Factorial Of Numbers In The Range:");
				for(int i = sRange;i<=eRange;i++) {
					factorial(i);
					
				}
			}
				break;
				
				case 3:{
					exit = false;
					System.out.println("Program Exit Success");
				}
				break;
				default: System.out.println("Invalid choice");
				
			
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void factorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		
		System.out.println("Factorial Of "+num+" is "+fact);
		
	}

}
