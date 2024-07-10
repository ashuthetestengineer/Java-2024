package logicalPrograms;
import java.util.Scanner;
//Swap two integer variables using a temporary variable
public class SwapOne {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Swap Two Numbers\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter First Number: ");
				int num1 = input.nextInt();
				System.out.println("Enter Second Number: ");
				int num2 = input.nextInt();
				swap(num1,num2);
						
			}
			break;
			case 2:{
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
	
	public static void swap(int num1,int num2) {
		System.out.println("Before Swap");
		System.out.println("=============");
		System.out.println("num 1 = "+num1);
		System.out.println("num 2= "+num2);
		//swap Two Variables using a Temporary Variable
		int num3 =num1;
		num1 =num2;
		num2 = num3;
		System.out.println("After  Swap");
		System.out.println("=============");
		System.out.println("num 1 = "+num1);
		System.out.println("num 2= "+num2);
		
		System.out.println("===SWAP SUCCESS=========");
		
		
	}

}
