package logicalPrograms;
import java.util.Scanner;
//Print the First n Fibonacci-numbers
/*
 * Fibonacci-Number = (Number-1) + (Number-2)
 */

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("==========================================");
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1.Find First N Fibonacci Numbers\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the value of N : ");
				int n = input.nextInt();
				System.out.println("First "+n +" Fibonacci Numbers are: ");
				System.out.println("==========================================");
				fibonacci(n);
			}
			break;
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default: System.out.println("Invalid choice");
			
			}
			
		}
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void fibonacci(int n) {
		int fib1 =0;
		int fib2 =1;
		int nextFib =0;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i =3;i<=n;i++) {
			nextFib=fib1+fib2;
			System.out.println(nextFib);
			fib1=fib2;
			fib2=nextFib;
			
		}
		
	}
	

}
