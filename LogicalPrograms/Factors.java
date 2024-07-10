package logicalPrograms;
import java.util.Scanner;

//Find Factors of a number
public class Factors {
	public static void main(String []args) {
		System.out.println("Main Starts");
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		while(exit) {
			System.out.println("Enter the choice ");
			System.out.println("\n 1.Find Factors\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number : ");
				int num = input.nextInt();
				System.out.println("Factors Of "+num +" are :");
				factors(num);
			}
			break;
			
			case 2: {
				exit = false;
				System.out.println("Program Exit Success ");
			}
			break;
			default : System.out.println("Invalid Choice");
			}
			
		}
		
		System.out.println("Main Ends");
		input.close();
		
		
	}
	
	public static void factors(int num) {
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	

}
