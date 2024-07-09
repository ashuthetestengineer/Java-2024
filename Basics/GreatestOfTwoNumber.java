package basicPrograms;
//Find the greatest of two number using IF statement
public class GreatestOfTwoNumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int num1 = 1908;
		int num2 = 18897;
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 :"+num2);
		if(num1>num2) {
			System.out.println("Number1 = "+num1+" is greatest" );
		}
		if(num2>num1) {
			System.out.println("Number2 = "+num2+" is greatest" );
		}
		
		System.out.println("Main Ends");
		
		
	}

}
