package basicPrograms;
//Using conditional operator find a number is odd or even
public class OddEvenCondtionalOperator {
	public static void main(String [] args) {
		System.out.println("Main starts");
		int number = 1088;
		System.out.println("Number is : "+number);
		String resultType = (number%2==0) ?"EVEN NUMBER":"ODD NUMBER"; 
		System.out.println("Type Is : "+resultType);
		System.out.println("Main Ends");
		
	}

}
