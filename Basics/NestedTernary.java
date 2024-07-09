package basicPrograms;
//Using Nested Ternary operator (conditional) find the smallest and biggest of five numbers
public class NestedTernary {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int num1 = 15;
		int num2 = 18;
		int num3 = 40;
		int num4 = 1090;
		int num5 = 87;
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		System.out.println("Number3 :"+num3);
		System.out.println("Number4 :"+num4);
		System.out.println("Number5 :"+num5);
		
		System.out.println("===================================");
		int smallest = (num1<num2 && num1<num3 && num1<num4 && num1<num5)?num1: (num2<num3 &&
				num2<num4 && num2<num5)?num2:(num3<num4 && num3<num5)? num3:(num4<num5)?num4:num5;
		
		int biggest = (num1>num2 && num1>num3 && num1>num4 && num1>num5)?num1 : (num2>num3 && num2 >num4 
				&& num2>num5)?num2 :(num3>num4 && num3>num5)?num3:(num4>num5)?num4:num5;
		
		System.out.println("Smallest OF Five Numbers: "+smallest);
		System.out.println("Biggest OF Five Numbers:"+biggest);
		System.out.println("Main Ends");
		
	}
	

}
