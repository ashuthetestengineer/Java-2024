package basicPrograms;
//Find greatest of two alphabets using IF statement
public class GreatestOfTwoAlphabet {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		char alpha1 = 'z';
		char alpha2 = 'f';
		System.out.println("Fisrt Alphabet : "+alpha1);
		System.out.println("Second Alphabet : "+alpha2);
		
		if(alpha1>alpha2) {
			System.out.println(alpha1+" IS Greatest");
		}
		
		if(alpha2>alpha1) {
			System.out.println(alpha2+" IS Greatest");
		}
		System.out.println("Main Ends");
		
	}

}
