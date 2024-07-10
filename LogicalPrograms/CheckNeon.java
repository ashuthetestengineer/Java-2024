package logicalPrograms;
import java.util.Scanner;

//Check a given number is a Neon-Number or not
/*
 * Neon_number : A Number whose sum of digits of its square is equal to original number
 * Example: 
 * Number = 9 ==> Square of 9 ==> 81
 * Sum of digits (81) = 8+1 ==> 9 == Original Number
 * So 9 is Neon-Number 
 * 
 */
public class CheckNeon {
	public static void main(String [] args) {
		System.out.println("main Strats");
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		while(exit) {
			System.out.println("Enter the choice: ");
			System.out.println("\n 1.Check Neon\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number To Check: ");
				int num = input.nextInt();
				neon(num);
			}
			break;
			
			case 2:{
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
	
	public static void neon(int num) {
		int originalNumber = num;
		System.out.println("Number is : "+num);
		int square = num*num;
		System.out.println("Square of Number : "+square);
		System.out.println("Sum of Digits of Square Of Number :");
		int sum =0;
		while(square!=0) {
			int digit=square%10;
			sum = sum+ digit;
			square=square/10;			
		}
		System.out.println(sum);
		if(originalNumber==sum) {
			System.out.println("Number Is Neon-Number");
		}
		else {
			System.out.println("Number is Not a Neon Number");
		}
		
	}

}
