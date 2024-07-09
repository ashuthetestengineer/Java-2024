package basicPrograms;
//Find the greatest of 3 alphabets using if else if ladder
public class GreatestOfThreeAlphabets {
	public static void main(String[] args) {
		System.out.println("Main starts");
		char alpha1 = 's';
		char alpha2 = 'o';
		char alpha3 = 'u';
		System.out.println("Alphabet1 : "+alpha1);
		System.out.println("Alphabet2 : "+alpha2);
		System.out.println("Alphabet3 : "+alpha3);
		System.out.println("===============================");
		if(alpha1>alpha2 && alpha1>alpha3) {
			System.out.println(alpha1 + " is Greatest");
		}
		else if(alpha2>alpha3) {
			System.out.println(alpha2+" is Greatest");
		}
		else {
			System.out.println(alpha3+" is Greatest");
		}
		
		System.out.println("Main Ends");
	}

}
