package basicPrograms;
/*
 * Take one short data and one integer data value, 
 * and perform division operation and print the result in short data value
 */
public class ShortIntDivision {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		short num1 = 23;
		int num2 = 3;
		System.out.println("Short data = "+num1);
		System.out.println("Int Data = "+num2);
		System.out.println("Normal Divison Result= "+(num1/num2) );
		System.out.println("====================================");
		System.out.println("Short Data Result after division: ");
		short result = (short)(num1/num2);
		System.out.println(result);
		System.out.println("Main Ends");
		
		
	}

}
