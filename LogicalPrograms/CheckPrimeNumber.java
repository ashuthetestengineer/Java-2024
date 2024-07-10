package logicalPrograms;
import java.util.Scanner;

//Check a given number is prime or not
/*
 * Prime Number : A Number which has only two factors 1 and the number itself
 * We also know that factors of a number 
 * whether even or odd factors are less than equal to half of number except the number itself
 * Factors of 12 = 1,2,3,4,6,
 * */
public class CheckPrimeNumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter your choice ");
			System.out.println("\n 1.Check Prime\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the number ");
				int num = input.nextInt();
				if(prime(num)) {
					System.out.println(num+" Is a Prime Number ");
					System.out.println("===========================");
				}
				else {
					System.out.println("It is not a Prime Number");
					System.out.println("===========================");
				}
			}
				break;
				
				case 2:{
					exit = false;
					System.out.println("Program Exit ");
				}
				break;
				
				default : System.out.println("Invalid choice"); 
			
			
			
			}
			
		}

		System.out.println("Main Ends");
		input.close();
		
		
	}
	
	public static boolean prime(int num) {
		boolean isPrime=true;
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(num+ " is also divisbile by "+i);
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			return true;
		}
		else return false;
		
		
		
		
	}

}
