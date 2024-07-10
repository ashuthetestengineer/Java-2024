package logicalPrograms;
import java.util.Scanner;
//Swap two integer variables Without using any temporary variable
public class SwapTwo {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter your choice: ");
			System.out.println("\n 1.Swap Two Numbers\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the First Number:");
				int num1 = input.nextInt();
				System.out.println("Enter the Second Number: ");
				int num2 =input.nextInt();
				swap(num1,num2);
			}
			break;
			
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default : System.out.println("invalid choice");
			
			}
			
		}
		
		System.out.println("Main Ends");
		input.close();
	
		
	}
	
	public static void swap(int num1, int num2) {
		System.out.println("Befor Swap ");
		System.out.println("=================");
		System.out.println("num1 : "+num1);
		System.out.println("num2 :"+num2);
		//swap
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1-num2;
		
		System.out.println("After Swap ");
		System.out.println("=================");
		System.out.println("num1 : "+num1);
		System.out.println("num2 :"+num2);
		
		
	}

}
