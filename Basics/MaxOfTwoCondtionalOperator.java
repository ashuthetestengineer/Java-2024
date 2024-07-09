package basicPrograms;
/*
 * Find and display max of two numbers using conditional(ternary) operator
 */
public class MaxOfTwoCondtionalOperator {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int num1 = 100;
		int num2 = 459;
		System.out.println("num1 = "+ num1);
		System.out.println("num2  = "+ num2);
		int max = num1>num2? num1 : num2;
		System.out.println("Max is = " + max );
		System.out.println("Main Ends");
	}
	

}
