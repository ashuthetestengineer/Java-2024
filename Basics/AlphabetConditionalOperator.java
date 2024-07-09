package basicPrograms;
//Using Conditional Operator find a given character is alphabet or not
public class AlphabetConditionalOperator {
	public static void main(String [] args) {
		System.out.println("Main Start");
		char ch = 'Z';
		System.out.println("Character is : "+ch);
		System.out.println("===========================================");
		String alphaCheck = (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')?"An Alphabet":"Not Alphabet";
		System.out.println("Is is "+alphaCheck);
		System.out.println("Main Ends");
	}

}
