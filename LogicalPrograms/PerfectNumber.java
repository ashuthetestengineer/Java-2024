package logicalPrograms;
import java.util.Scanner;
//Check a given number is a perfect number or not
/*
 * PERFECT NUMBER 
 * A number whose sum of its factors (except number itself) is
 * EQUAL to number itself
 * Example: 6 
 * Factors of 6 = 1,2,6
 * Sum Of Factors = 1+2+3=6 == Number itself 
 * So 6 is Perfect Number
 * Also, For any number All the Even Factors are less than equal to half of the number 
 * and Even factors are less than half of the number  
 * */
public class PerfectNumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your choice:");
			System.out.println("\n 1.Check Perfect Number\n 2.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the Number :");
				int num = input.nextInt();
				System.out.println("Number is :"+num);
				checkPerfect(num);
			}
			break;
			
			case 2:{
				exit = false;
				System.out.println("Program Exit Success");
			}
			break;
			
			default : System.out.println("Invalid choice");
			}

		}
		System.out.println("Main Ends");
		input.close();
	}
	
	public static void checkPerfect(int num) {
		int originalNumber = num;
		int sumOfFactors = 0;
		for(int i=1;i<=(num/2);i++) {
			if(num%i==0) {
				sumOfFactors +=i; 
			}
			
		}
		if(sumOfFactors==originalNumber) {
			System.out.println("Number is Perfect Number");
			System.out.println("=============================");
		}
		else {
			System.out.println("Number is Not Perfect");
			System.out.println("=============================");
		}
		
		
	}


	

}
