package basicPrograms;
/*
 *Take two data values one of high data type and one of low data type
 *  and perform arithmetic operations and observe the resulting data type
 */
public class DifferentDataTypeArithmetics {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		double number1 = 1024.2456; //High Range Data Value
		int   number2  = 5 ;   //Low Range Data Value
		System.out.println("===================================");
		System.out.println("Double data = "+number1);
		System.out.println("Integer data = "+number2);
		System.out.println("Arithmetic Results");
		System.out.println("number1 + number2 = "+(number1+number2));
		System.out.println("number1 - number2 = "+(number1-number2));
		System.out.println("number1 * number2 = "+(number1*number2));
		System.out.println("number1 / number2 = "+(number1/number2));
		System.out.println("number1 % number2 = "+(number1%number2));
	
		
		System.out.println("Main Ends");
		
	}

}
