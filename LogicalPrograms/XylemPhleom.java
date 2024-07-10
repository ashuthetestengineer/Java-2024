package logicalPrograms;
import java.util.Scanner;

//Check a Given Number is a Xylem or Phleom-Number
/*
 *  If Sum of first and Last digit of number = Sum of all mean digits ==> Xylem-Number 
 *  Otherwise Phleom-Number
 */
public class XylemPhleom {
	public static void main(String [] args) {
		System.out.println("Main Start");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = input.nextInt();
		checkXylemPhleom(num);
		System.out.println("Main Ends");
		input.close();
		
	}
	
	public static void checkXylemPhleom(int num) {
		int sumExtreme= 0;
		int sumMeanNumbers =0;
		
		for(int i =num;i!=0;i/=10) {
			if(i==num || i<10) {
				sumExtreme += i%10;
				
			}
			else {
				sumMeanNumbers += i%10;
			}
		}
		
		if(sumExtreme==sumMeanNumbers) {
			System.out.println("Xylem Number");
			System.out.println("===============");
		}
		else
		{
			System.out.println("Phloem Number");
			System.out.println("===============");
		}
			
			
		
		
	}

}
