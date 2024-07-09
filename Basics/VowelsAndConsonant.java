package basicPrograms;
//Print all vowels and consonants using do while loop
public class VowelsAndConsonant {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Vowels are: ");
		char vowel = 'a';
		do {
			if(vowel=='a' || vowel=='e'|| vowel=='i'|| vowel=='o'|| vowel=='u') {
				System.out.println(vowel);
			}
			vowel++;
				
		}while(vowel<='z');
		System.out.println("================================");
		
		System.out.println("Consonant Are: ");
		char consonant = 'b';
		do {
			if(consonant!='a' && consonant!='e'&& consonant!='i'&& consonant!='o'&& consonant!='u') {
				System.out.println(consonant);
			}
			consonant++;
				
		}while(consonant<='z');
		System.out.println("Main Ends");
	}

}
