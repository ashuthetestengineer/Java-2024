package logicalPrograms;
import java.util.Scanner;

//Find all Perfect Numbers in a given range
public class PerfectInRange {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Perfect or Not\n 2.Find Perfect Numbers In A Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the Number:");
				int num = input.nextInt();
				if(perfect(num)) {
					System.out.println(num+" IS A PERFECT NUMBER");
					System.out.println("============================================");
				}
				else {
					System.out.println("It is Not A Perfect Number");
					System.out.println("============================================");
				}
			}
			break;
			case 2:{
				System.out.println("Enter the Start Of Range");
				int sRange = input.nextInt();
				System.out.println("Enter the End Of Range");
				int eRange = input.nextInt();
				System.out.println("Perfect Numbers For The Given Range Are: ");
				System.out.println("============================================");
				for(int i=sRange;i<=eRange;i++) {
				boolean check =	perfect(i);
				if(check) {
					System.out.println(i);
				}
				
				}
				
			}
			break;
			case 3:{
				exit = false;
				System.out.println("Program Exit Success ");
				
			}
			break;
			default:System.out.println("Invalid Choice");
			
			}
			
		}

		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static boolean perfect(int number) {
		int sumOfFactors =0;
		int originalNumber = number;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sumOfFactors+=i;
			}
		}
		if(sumOfFactors==originalNumber) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
