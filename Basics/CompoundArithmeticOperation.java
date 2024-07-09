package basicPrograms;
/*
 * Take 2 double data values and perform all arithmetic operations using 
 * compound assignment operator 
 * along with arithmetic operator and print the result
 */
public class CompoundArithmeticOperation {
	public static void main (String[] args) {
		System.out.println("main Starts");
		double num1 = 512;
		double num2 = 1024;
		System.out.println("Number1 = "+num1);
		System.out.println("Number2 = "+num2);
		
		//Arithmetic operations
		num1 += num2;//add result stored in num1
		System.out.println("num1+=num2 :"+num1);
		System.out.println("num1-=num2 :"+(num1-=num2));
		System.out.println("num1*=num2 :"+(num1*=num2));
		System.out.println("num1/=num2 :"+(num1/=num2));
		System.out.println("num1%=num2 :"+(num1%=num2));
		
		System.out.println("===============================");
		System.out.println("Latest num1 Value = "+num1);
		System.out.println("Latest num2 Value = "+num2);
		
		
		System.out.println("main Ends");
	}

}
