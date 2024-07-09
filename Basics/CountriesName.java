package basicPrograms;
import java.util.Scanner;
//Read 3 countries name from user and print them on console using Scanner class 
public class CountriesName {
	public static void main (String [] args) {
		System.out.println("Main Start");
		Scanner countryName =new Scanner(System.in);
		System.out.println("Enter Name of Firts Country: ");
		System.out.println("==================================");
		String name1 = countryName.nextLine();
		
		System.out.println("Enter Name of Second Country: ");
		System.out.println("==================================");
		String name2 = countryName.nextLine();
		
		System.out.println("Enter Name of Third Country: ");
		System.out.println("==================================");
		String name3 = countryName.nextLine();
		
		System.out.println("==================================");
		System.out.println("First Country :"+name1);
		System.out.println("Second Country :"+name2);
		System.out.println("Third Country :"+name3);
		countryName.close();
		
		System.out.println("Main Ends");
	}

}
