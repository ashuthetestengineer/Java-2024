package basicPrograms;
//Find if a given number is a multiple of both 3 and 7 or not using IF ELSE statement
public class MultipleOfTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int number = 42;
		System.out.println("Number is : "+number);
		if(number%3==0 && number%7==0) {
			System.out.println(number+" is a multiple of 3 and 7");
		}
		else {
			System.out.println(number+" is not a multiple of 3 and 7");
		}
		System.out.println("Main Ends");
	}

}
