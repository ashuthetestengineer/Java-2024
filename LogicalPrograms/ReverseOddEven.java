package logicalPrograms;
import java.util.*;
//Take a number, reverse it and then check that reversed number is odd or even
public class ReverseOddEven {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Reverse And Check Odd OR Even\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter The Number: ");
				int num = input.nextInt();
				int revNumber = reverseNumber(num);
				System.out.println("Number is : "+num);
				System.out.println("Reversed Number is :"+revNumber);
				if(revNumber%2==0) {
					System.out.println("Reversed Number is EVEN");
					System.out.println("============================");
				}
				else {
					System.out.println("Reverse Number is ODD");
					System.out.println("============================");
				}
				
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
	public static int reverseNumber(int num) {
		int revNum =0;
		
		while(num>0) {
			revNum = revNum*10+(num%10);
			num = num/10;
		}
		return revNum;
		
	}

}
