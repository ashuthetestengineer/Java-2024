package basicPrograms;
//Print even numbers from 10 to 100 using while loop
public class EvenInRange {
	public static void main(String [] args) {
		System.out.println("Main Start");
		int number = 10;
		System.out.println("Even Number Between 10 to 100 :");
		while(number<=100) {
			if(number%2==0) {
				System.out.println(number);
			}
			number++;
		}
		System.out.println("Main Ends");
	}

}
