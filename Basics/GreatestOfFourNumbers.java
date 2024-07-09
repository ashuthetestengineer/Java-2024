package basicPrograms;
//Find the greatest of 4 numbers using If else if ladder
public class GreatestOfFourNumbers {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int num1 = 273;
		int num2 = 34;
		int num3 = 44;
		int num4 = 129;
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		System.out.println("Number3 :"+num3);
		System.out.println("Number4 :"+num4);
		
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println(num1+" Number1 is Greatest");
		}
		
		else if(num2>num3 && num2>num4) {
			System.out.println(num2+" Number2 is greatest");
		}
		else if(num3>num4) {
			System.out.println(num3+" Number3 is greatest");
		}
		else {
			System.out.println(num4+" Number4 is Greatest");
		}
		System.out.println("Main Ends");
	}

}
