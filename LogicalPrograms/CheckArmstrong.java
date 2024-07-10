package logicalPrograms;
import java.util.Scanner;
//Check a GIven number is an Armstrong Number or not, then also find 
//Armstrong numbers in a range
/*
 * ArmStrong Number : If sum of nth power of each digit of a n-digit number is
 * equal to original number, then that number is Armstrong Number
 * 123 : 3digit number so Power of 3
 * 1*1*1+2*2*2+3*3*3= 1+8+27 =36 Not Equal to 123
 * So not Armstrong
 */
public class CheckArmstrong {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Check Armstrong Or Not\n 2.Find Armstrong Numbers in A Range\n 3.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number : ");
				int num = input.nextInt();
				if(checkArmstrong(num)) {
					System.out.println(num+" Is an Armstrong Number ");
					System.out.println("===============================");
					
				}
				else {
					System.out.println("It is not an Armstrong Number ");
					System.out.println("===============================");
				}
			}
			break;
			
			case 2: {
				System.out.println("Enter the start of Range: ");
				int sRange = input.nextInt();
				System.out.println("Enter the End Of Range : ");
				int eRange = input.nextInt();
				System.out.println("Armstrong Numbers in the Range :");
				System.out.println("===============================");
				for(int i = sRange;i<=eRange;i++) {
					if(checkArmstrong(i)) {
					System.out.println(i);
				}
				}

			}
			break;
			
			default : System.out.println("Invalid Choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static boolean checkArmstrong(int num) {
		int originalNumber = num;
		int temp = num;
		int noOfDigits =0;
		int sum=0;
		while(num>0) {
			num=num/10;
			noOfDigits++;			
		}
		while(temp>0) {
			int rem =temp%10;
			sum +=Math.pow(rem, noOfDigits);
			temp = temp/10;
		}
		
		if(sum==originalNumber) {
			return true;
		}
		else return false;
		
		
	}

}
