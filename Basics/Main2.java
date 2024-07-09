package basicPrograms;
import java.util.Scanner;

//Find and print the modulus of two numbers using a second main method and 
//ask the numbers from user at run time
public class Main2 {
	public static void main(String []args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the firt number :");
		int num1 = input.nextInt();
		
		System.out.println("Enter the second number :");
		int num2 = input.nextInt();
		
		main(num1,num2);
		
		
		System.out.println("Main Ends");
		input.close();
	}
	
	public static void main(int a, int b) {
		System.out.println("2nd Main Starts");
		int result = a%b;
		System.out.println("a % b : "+result);
		System.out.println("2nd Main Ends");
	}

}
