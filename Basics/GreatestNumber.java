package basicPrograms;
import java.util.Scanner;
//Find the greatest of three numbers using a method and take all 3 numbers from user at run time
public class GreatestNumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		System.out.println("Enter 3 numbers to find the Greatest:");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = input.nextInt();
		
		System.out.println("Enter Third Number : ");
		int num3 = input.nextInt();
		
		System.out.println("Greatest of 3 numbers is  : "+greatest(num1,num2,num3));
		
		System.out.println("Main Ends");
		input.close();
	}
	
	public static int greatest(int a, int b, int c) {
		
		int greatest = (a>b && a>c)? a:(b>c)? b:c;
		return greatest;
		
	}

}
