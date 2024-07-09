package basicPrograms;
//Find the sum of all numbers from 87 to 65 using do while loop
public class SumDoWhile {
	public static void main(String[] args) {
		System.out.println("Main Start");
		int sum =0;
		int loop = 87;
		do {
			sum = sum+loop;
			loop--;		
		}while(loop>=65);
		System.out.println("sum of all numbers from 87 to 65 :"+sum);
		System.out.println("Main Ends");
	}

}
