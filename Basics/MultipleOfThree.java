package basicPrograms;
//Print all multiples of 3 less than 50 using while loop
public class MultipleOfThree {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		System.out.println("Mutiple of 3 less than 50 :");
		int number = 3;
		while(number<=50){
			if(number%3==0) {
				System.out.println(number);
			}
			number++;
			
			
		}
		System.out.println("Main Ends");
	}

}
