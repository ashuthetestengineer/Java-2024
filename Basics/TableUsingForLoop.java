package basicPrograms;
import java.util.Scanner;
//Take number from user and print the table up to 10 using for loop 
public class TableUsingForLoop {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner number = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = number.nextInt();
		System.out.println("Table Of "+num+" :");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		number.close();
		System.out.println("Main Ends");
		
	}

}
