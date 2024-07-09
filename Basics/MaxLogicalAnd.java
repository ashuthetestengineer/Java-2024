package basicPrograms;
/*
 * Take 3 numbers and using Logical And operator print Boolean result to find max number
 */
public class MaxLogicalAnd {
	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("==============================");
		int num1 = 19;
		int num2 = 34;
		int num3 = 90;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
		System.out.println("==============================");
		System.out.println("IS num1 Max : "+(boolean)(num1>num2 && num2>num3));
		System.out.println("Is num2 Max :"+(boolean)(num1<num2 && num2>num3));
		System.out.println("Is num3 Max : "+(boolean)(num1<num2 && num2<num3));
		
		
		System.out.println("Main Ends");
	}

}
