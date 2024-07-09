package basicPrograms;
/*
 * Take 2 numbers, pre-increment first number, 
 * post-decrement first number and print the result of all arithmetic operations
 */
public class NumberIncrementDecrement {
	public static void main(String []args) {
		System.out.println("Main Starts");
		int num1 = 19;
		int num2 = 11;
		System.out.println("Number1 = "+num1);
		System.out.println("Number2 = "+num2);
		System.out.println("=============================================");
		int preIncrement = ++num1;
		int postDecrement = num2--;
		System.out.println("Pre Increment Value OF Number1 :"+preIncrement);
		System.out.println("Post Decrement Value OF Number2 :"+postDecrement);
		System.out.println("=============================================");
		System.out.println("Addition Result = "+(preIncrement+postDecrement));
		System.out.println("Subtraction Result = "+(preIncrement-postDecrement));
		System.out.println("Multiplication Result = "+(preIncrement*postDecrement));
		System.out.println("Divison Result = "+(preIncrement/postDecrement));
		System.out.println("Modulus Result = "+(preIncrement%postDecrement));
		
		System.out.println("Main Ends");
		
	}

}
