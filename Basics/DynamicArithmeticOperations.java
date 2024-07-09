package basicPrograms;
import java.util.Scanner;
//Read Two numbers from user and perform all the arithmetic operations on it
public class DynamicArithmeticOperations {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner number = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = number.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = number.nextInt();
		System.out.println("=============================");
		System.out.println("First Number : "+num1);
		System.out.println("Second Number :"+num2);
		System.out.println("Arithmetic Results ");
		System.out.println("==============================");
		System.out.println("num1 + num2 : "+(num1+num2));
		System.out.println("num1 - num2 : "+(num1-num2));
		System.out.println("num1 * num2 : "+(num1*num2));
		System.out.println("num1 / num2 : "+(num1/num2));
		System.out.println("num1 % num2 : "+(num1%num2));
		number.close();
		System.out.println("Main Ends");
	}

}
