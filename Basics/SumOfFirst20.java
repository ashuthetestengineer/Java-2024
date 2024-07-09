package basicPrograms;
//Find sum of first 20 positive number using for loop
public class SumOfFirst20 {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		System.out.println("Sum OF First 20 Number :");
		int sum=0;
		for(int i =1;i<=20;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println("Main Ends");
	}

}
