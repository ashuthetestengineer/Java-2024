package basicPrograms;
import java.util.Scanner;
//Find the sum of two integer numbers using a method where parameter data type of
//method is float and return type is integer
public class AdditionMethod {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = input.nextInt();
		System.out.println("Addition result is : "+add(num1,num2));
		System.out.println("Add Method Ended : ");
		System.out.println("Main Ends");
		input.close();
	}
	
	public static int add(float a, float b) {
		System.out.println("Add Method Start :");
		return (int)(a+b);
		
	}


}
