package logicalPrograms;
import java.util.Scanner;
//Find all the spy numbers in a given range
public class SpyInRange {
	public static void main(String []args) {
		System.out.println("Main Starts ");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Number Is Spy or not\n 2.Find Spy Numbers In a Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number : ");
				int num = input.nextInt();
				boolean check = spy(num);
				if(check) {
					System.out.println(num+" IS A SPY NUMBER ");
				}
				else {
					System.out.println("It is Not A Spy Number");
				}
				
			}
			break;
			case 2: {
				System.out.println("Enter the Start of Range: ");
				int sRange = input.nextInt();
				System.out.println("Enter the End of Range: ");
				int eRange = input.nextInt();
				System.out.println("All the SPY Numbers in Range are: ");
				System.out.println("=================================");
				for(int i = sRange ;i<=eRange;i++) {
					if(spy(i)) {
						System.out.println(i+" ");
					}
				}
				
			}
			break;
			case 3:{
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
	
	
	public static boolean spy(int num) {
		int num2 = num;
		int sumOfDigits = 0;
		while(num2!=0) {
			sumOfDigits = sumOfDigits + (num2%10);
			num2 = num2/10;
		}
		
		int num3 = num;
		int product =1;
		while(num3!=0) {
			product = product *(num3%10);
			num3=num3/10;
		}
		
		if(sumOfDigits==product) {
			return true;
		}
		else return false;
	}

}
