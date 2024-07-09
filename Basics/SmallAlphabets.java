package basicPrograms;
//Print all 26 alphabets in small letters using while loop
public class SmallAlphabets {
	public static void main (String[] args) {
		System.out.println("Main Starts");
		System.out.println("==================");
		System.out.println("Small English Alphabets :");
		char alphabet = 'a';
		while(alphabet<='z') {
			System.out.print(" "+ alphabet+ " ");
			alphabet++;
		}
		System.out.println();
		System.out.println("Main Ends");
	}

}
