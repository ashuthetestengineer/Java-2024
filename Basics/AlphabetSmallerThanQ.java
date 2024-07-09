package basicPrograms;
//Print all the alphabets smaller than q using do while loop
public class AlphabetSmallerThanQ {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		System.out.println("Alphabet Smaller Than q: ");
		char alphabet = 'q';
		do {
			System.out.println(alphabet);
			--alphabet;
			
		}while(alphabet>='a');
		System.out.println("Main Ends");
		
	}

}
