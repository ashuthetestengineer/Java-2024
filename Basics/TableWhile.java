package basicPrograms;
import java.util.Scanner;
//Take a number from user and print its table till 10 multiples using while loop
public class TableWhile {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = number.nextInt();
		System.out.println("Table of "+num+" :");
		int i =1;
		while(i<=10) {
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		}
		number.close();
		System.out.println("Main Ends");
	}

}
