package basicPrograms;
//Take two integer variables and perform all possible arithmetic operations using
//arithmetic operators
public class IntegerArithmetic {
	public static void main(String[] args) {
		System.out.println("Main starts");
		int num1 = 100;
		int num2 = 50;
		System.out.println("First Variable value = "+num1);
		System.out.println("Second Varibale Value="+num2);
		System.out.println("num1 + num2 ="+(num1+num2));//addition
		System.out.println("num1 - num2 ="+(num1-num2));//subtraction
		System.out.println("num1 * num2 ="+(num1*num2));//multiplication
		System.out.println("num1 / num2 ="+(num1/num2));//division 
		System.out.println("num1 % num2 ="+(num1%num2));//modulus
		
		System.out.println("Main Ends");
	}

}
