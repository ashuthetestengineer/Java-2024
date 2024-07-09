package basicPrograms;
//Print sum of all numbers from 1 to 15 using while loop
public class SumOfNumberWhile {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int number = 1;
		int sum =0;
		while(number<=15) {
			sum = sum + number;
			number++;
		}
		System.out.println("Sum Of Numbers from 1 to 15 :"+sum);
		System.out.println("Main Ends");
	}

}
