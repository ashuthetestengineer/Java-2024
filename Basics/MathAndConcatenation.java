package basicPrograms;
/*
 *Take an integer variable with value 40, assign its value to another integer variable
 *and print the following 
 *“40Primitive Data”, then “80PrimitiveData”, then”1600Primitive Data”, 
 *then ”Primitive Data4040” and finally 
 *“PrimitiveData80”
 */
public class MathAndConcatenation {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		System.out.println("===================================");
		//first variable 
		int number1 = 40;
		//variable 2
		int number2 = number1;
		
		
		//Required Outputs
		System.out.println("First Variable number1 = "+number1);
		System.out.println("First Variable number2 = "+number2);
		System.out.println("===================================");
		System.out.println("Required Outputs are: ");
		System.out.println("===================================");
		System.out.println(number1+"Primitive Data ");
		System.out.println(number1+number2+"Primitive Data ");
		System.out.println(number1*number2+"Primitive Data ");
		System.out.println("Primitive Data"+number1+number2);
		System.out.println("Primitive Data"+(number1+number2));
		
		System.out.println("===================================");
		
		System.out.println("Main Ends");
		
	}

}
