package logicalPrograms;
import java.util.Scanner;
//Reverse a given number using concept of recursion
public class ReverseUsingRecursion {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter your Choice: ");
			System.out.println("\n 1.Reverse A Number\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the number: ");
				int num = input.nextInt();
				System.out.println("Original Number = "+num);
				System.out.println("Reverse Of Number = ");
				
				reverse(num);
			}
			break;
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			
			default : System.out.println("Invalid Choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
	}
	
	public static void reverse(int num) {
		
		
		if(num<10) {
			System.out.println(num);
			
			return;
		}
		else {
			System.out.print(num%10);
			reverse(num/10);//recursion
		}
		
	}


}
