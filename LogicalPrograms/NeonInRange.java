package logicalPrograms;
import java.util.Scanner;
//Find all the Neon-Numbers in a given range
public class NeonInRange {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		while(exit) {
			System.out.println("Enter a valid Choice :");
			System.out.println("\n 1.Check Neon Or Not\n 2.Find Neon Numbers In a Range\n 3.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				neon(num);
			}
			break;
			
			case 2:{
				System.out.println("Enter Start Of Range:");
				int sRange = input.nextInt();
				System.out.println("Enter the End Of Range: ");
				int eRange = input.nextInt();
				
				neonRange(sRange, eRange);
				
			}
			break;
			
			default : System.out.println("Invalid choice");
			
			
			}
		}
		System.out.println("Main Ends");
		input.close();
	}
	
	public static void neon(int num) {
		int originalNumber = num;
		System.out.println("Number is :"+originalNumber);
		int square = num*num;
		System.out.println("Square Of Number is : "+square);
		int sum =0;
		int digit =0;
		System.out.println("Sum of Digits Of Square is : ");
		while(square!=0) {
			digit = square%10;
			sum = sum+digit;
			square = square/10;
			
		}
		System.out.println(sum);
		
		if(sum == originalNumber) {
			System.out.println("Number is Neon Number");
			System.out.println("===========================");
		}
		else {
			
			System.out.println("Number is Not Neon - Number");
			System.out.println("===========================");
		}
		
	}
	
	public static void neonRange(int sRange, int eRange) {
		System.out.println("Start Of Range: "+sRange);
		System.out.println("End Of Range : "+eRange);
		System.out.println("All Neon Numbers for the range are: ");
		
		for(int i = sRange;i<=eRange;i++) {
			int sum=0;
			int square = i*i;
			while(square!=0) {
				int digit = square%10;
				sum = sum+digit;
				square = square/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			
			
		}
		System.out.println("===========================");
		
	}

}
