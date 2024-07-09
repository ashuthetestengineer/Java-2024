package basicPrograms;
//Print all the odd and even numbers between 35 to 85 using do while loop
public class OddEvenDoWhile {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		int evenLoop =35;
		int oddLoop = 35;
		System.out.println("Even Numbers: ");
		do {
			if(evenLoop%2==0) {
				System.out.println(evenLoop);
			}
			
			evenLoop++;
						
		}while(evenLoop<=85);
		
		
		System.out.println("ODD Numbers: ");
		do {
			if(oddLoop%2!=0) {
				System.out.println(oddLoop);
			}
			
			oddLoop++;
						
		}while(oddLoop<=85);
		
		
		
		System.out.println("Main Ends");
	}

}
