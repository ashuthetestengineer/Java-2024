package basicPrograms;
/*
 *Take any 3 alphabet and using pre-increment operator increment and print the resultant value,
 *then take new 3 alphabets and using pre-decrement operator perform same operations
 */
public class CharacterIncrementDecrement {
	public static void main (String[] args) {
		System.out.println("Main Starts");
		char alpha1 = 'a';
		char alpha2 = 'c';
		char alpha3 = 'e';
		System.out.println("=======================================================");
		System.out.println("First Alphabet : "+alpha1);
		System.out.println("Pre-Increment Value of First Alphabet: "+(++alpha1));
		
		System.out.println("Second Alphabet : "+alpha2);
		System.out.println("Pre-Increment Value of Second Alphabet: "+(++alpha2));
		
		System.out.println("Third Alphabet : "+alpha3);
		System.out.println("Pre-Increment Value of Third Alphabet: "+(++alpha3));
		
		System.out.println("=======================================================");
		
		char alpha4 = 'z';
		char alpha5 = 'x';
		char alpha6 = 'v';
		System.out.println("Fourth Alphabet : "+alpha4);
		System.out.println("Pre-Decrement Value of Fourth Alphabet: "+(--alpha4));
		
		System.out.println("Fifth Alphabet : "+alpha5);
		System.out.println("Pre-Decrement Value of Fifth Alphabet: "+(--alpha5));
		
		System.out.println("Sixth Alphabet : "+alpha6);
		System.out.println("Pre-Decrement Value of Sixth Alphabet: "+(--alpha6));
		
		System.out.println("Main Ends");
		
	}

}
