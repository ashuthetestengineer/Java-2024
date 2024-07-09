package basicPrograms;
import java.util.Scanner;
//Perform all arithmetic operations on two numbers, 
//where each operation is performed using separate method and numbers are taken from user at run time
public class ArithmeticMethod {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
		System.out.println("Choose the Operation\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit\n");
		int choice = input.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter First Integer number");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Integer number");
			int num2 = input.nextInt();
			System.out.println("num1 + num2 = "+add(num1,num2));
			System.out.println("================================");
		}
		break;
		
		case 2:{
			System.out.println("Enter First Integer number");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Integer number");
			int num2 = input.nextInt();
			System.out.println("num1 - num2 = "+subtract(num1,num2));
			System.out.println("================================");
		}
		break;
		
		case 3:{
			System.out.println("Enter First Integer number");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Integer number");
			int num2 = input.nextInt();
			System.out.println("num1 * num2 = "+multiply(num1,num2));
			System.out.println("================================");
		}
		break;
		
		case 4:{
			System.out.println("Enter First Integer number");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Integer number");
			int num2 = input.nextInt();
			System.out.println("num1 / num2 = "+divide(num1,num2));
			System.out.println("================================");
		}
		break;
		
		case 5:{
			System.out.println("Enter First Integer number");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Integer number");
			int num2 = input.nextInt();
			System.out.println("num1 % num2 = "+modulus(num1,num2));
			System.out.println("================================");
		}
		break;
		
		case 6: {exit =false;
        System.out.println("Thank You\n Exit success");
                   
       }break; 
		
		default : System.out.println("Please Enter a valid choice\n");
		
		}
		System.out.println("Main Ends");
		
		}
		
		input.close();
	}
	
	
	public static int add(int a , int b) {
		return (a+b);
	}
	
	public static int subtract(int a , int b) {
		return (a-b);
	}
	public static int multiply(int a , int b) {
		return (a*b);
	}
	public static int divide(int a , int b) {
		return (a/b);
	}
	public static int modulus(int a , int b) {
		return (a%b);
	}
	
}


