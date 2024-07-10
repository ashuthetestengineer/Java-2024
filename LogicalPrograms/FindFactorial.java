package logicalPrograms;
import java.util.Scanner;
//Find Factorial of a number
/*
 * Factorial(num)=num*(num-1)*(num-2)*(num-3)....*1
 * */
public class FindFactorial {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter your Choice: ");
			System.out.println("\n 1.Find Factorial\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				
				factorial(num);
			}
			break;
			case 2:{
				exit = false;
				System.out.println(" Program Exit ");
			}
			break;
			default : System.out.println("Invalid Choice ");
			
			}
			
		}
		
				
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void factorial(int num) {
		int fact =1;
		for(int i = num;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println("Factorial Of "+num+" is :"+fact);
		
		
	}

}
