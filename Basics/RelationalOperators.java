package basicPrograms;
/*
 *Using all relational operators print Boolean results for all type of comparison 
 *between 100 and 500 integer value.
 */
public class RelationalOperators {
	public static void main(String[] args) {
		System.out.println("Main starts");
		int num1 = 100;
		int num2 = 500;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+ num2);
		System.out.println("num1 == num2 "+ (boolean)(num1==num2));
		System.out.println("num1 !=num2 "+ (boolean)(num1!=num2));
		System.out.println("num1 < num2 "+ (boolean)(num1<num2));
		System.out.println("num1 >num2 "+ (boolean)(num1>num2));
		System.out.println("num1 <=num2 "+ (boolean)(num1<=num2));
		System.out.println("num1 >=num2 "+ (boolean)(num1>=num2));
		System.out.println("Main Ends");
		
	}
	

}
