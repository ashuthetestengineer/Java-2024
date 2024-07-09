package basicPrograms;
//Find a given number is odd or even using IF statement
public class OddEvenIF {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int number = 189;
		System.out.println("Number is :"+number);
		if(number%2==0) {
			System.out.println(number +" IS EVEN");
		}
		if(number%2!=0) {
			System.out.println(number +" Is ODD");
		}
		System.out.println("Main Ends");
		
	}

}
