package logicalPrograms;
import java.util.Scanner;

//Find all Prime numbers in a given range
public class PrimeInRange {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter your choice ");
			System.out.println("\n 1.Check Prime\n 2.Find Prime Numbers In Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the number: ");
				int num = input.nextInt();
				if(prime(num)) {
					System.out.println(num+" Is Prime ");
					System.out.println("========================");
					
				}
				else {
					System.out.println("It is not prime ");
					System.out.println("========================");
				}
				
			}
			break;
			
			case 2:{
				System.out.println("Enter the start of range :");
				int sRange = input.nextInt();
				
				System.out.println("Enter the end of range :");
				int eRange = input.nextInt();
				System.out.println("Prime Numbers in The Given Range: ");
				System.out.println("========================");
				
				for(int i = sRange;i<=eRange;i++) {
					
					boolean isPrime = prime(i);
					if(isPrime) {
						System.out.println(i);
					}
				}
				}
			break;
			
			case 3:{
				exit = false;
				System.out.println("Program Exit success");
			}
			break;
			default : System.out.println("Invalid choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static boolean prime(int num) {
		if(num==1){
			return false;
		}
		
		else{
		boolean checkPrime = true;
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				checkPrime = false;
				break;
			}
		}
		if(checkPrime) {
			return true;
		}
		else return false;
		
	}
	}
	

}
