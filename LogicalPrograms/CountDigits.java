package logicalPrograms;
import java.util.Scanner;
//Count the number of digits of a given number
public class CountDigits {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice:");
			System.out.println("\n 1.Count Number Of Digits\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				System.out.println("Number is :"+num);
				countDigits(num);
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
	public static void countDigits(int num) {
		int count =0;
		while(num>0) {
			num =num/10;
			count++;
		}
		System.out.println("Number of Digits : "+count);
		System.out.println("=============");
		
	}
	

}
