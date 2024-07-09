package basicPrograms;
//Find a given number is positive or negative using IF statement
public class PositiveNegativeIF {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int number = -90;
		System.out.println("Number is : "+number);
		if(number==0) {
			System.out.println("Number is Zero: A non negative Number");
		}
		if(number<0) {
			System.out.println(number +" Is Negative");
		}
		if(number>0) {
			System.out.println(number + " Is Positive");
		}
		
		
		System.out.println("Main Ends");
		
	}

}
