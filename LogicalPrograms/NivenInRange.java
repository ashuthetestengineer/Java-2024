package logicalPrograms;
import java.util.Scanner;

//Find all the Niven-numbers in a given range
public class NivenInRange {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check A Number Is Niven Or Not\n 2.Find Niven Numbers In Range\n 3.Exit ");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				niven(num);
				
			}
			break;
			
			case 2: {
				System.out.println("Enter the Start Range: ");
				int sRange = input.nextInt();
				System.out.println("Enter the End Range :");
				int eRange = input.nextInt();
				nivenRange(sRange,eRange);
			}
			break;
			
			case 3:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default : System.out.println("Invalid Choice");
			
			}
			
		}
		
		System.out.println("Main Ends");
		input.close();
		
		
	}
	
	public static void niven(int num) {
		int originalNumber = num;
		System.out.println("Number is : "+originalNumber);
		System.out.println("Sum of Digits Of Number is :");
		int sumOfDigits = 0;
		while(num!=0) {
			sumOfDigits = sumOfDigits + (num%10);
			num=num/10;
			
		}
		System.out.println(sumOfDigits);
		if(originalNumber%sumOfDigits == 0) {
			System.out.println(originalNumber+ " Is Niven Number");
			System.out.println("==================================");
			
		}
		else {
			System.out.println("Number is Not Niven-Number");
			System.out.println("================================");
		}
		
	}
	
	public static void nivenRange(int start, int end) {
		System.out.println("Start Of Range is : "+start);
		System.out.println("End Of Range is : "+end);
		System.out.println("All Niven Numbers in the Range are: ");
		for(int i = start;i<=end;i++) {
			int currentValue = i;
			int sumOfDigits = 0;
			//sum of Digits
			while(i!=0) {
				sumOfDigits = sumOfDigits +(i%10);
				i = i/10;
				
			}
			
			if(currentValue%sumOfDigits==0) {
				System.out.println(currentValue);
			}
			i = currentValue;
		}
		//We can also call the nivenRange function inside a for loop
		//from main method and for each value in the range we can separately check
		//it is niven or not,and print accordingly
		
	}

}
