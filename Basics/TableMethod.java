package basicPrograms;
import java.util.Scanner;
//Print the table of a number using method and ask the number from user at run time
public class TableMethod {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Enter Your Choice\n");
			System.out.println("1.Find A Table\n 2.Exit");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter The Number For Table: ");
				int num = input.nextInt();
				table(num);
			}
			break;
			
			case 2: {
				exit = false;
				System.out.println("Thank You.\n Program Exit Successful ");
				
			}
			break;
			
			default : System.out.println("Please enter a valid choice \n");
				
			
			}
			
		}
		
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void table(int a) {
		System.out.println("Table of "+a+" is : ");
		for(int i = 1;i<=10;i++) {
			System.out.println(a+" x "+i+" = "+(a*i));
		}
		
	}

}
