package basicPrograms;
//Find if a person is eligible to vote or note on the basis of age using IF ELSE Statement
public class VotingAge {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		float age = 19.9f;
		System.out.println("Current Age Of Person: "+age);
		System.out.println("Minimum Age Of Voting is 18 Years ");
		System.out.println("===========================================");
		if(age<18) {
			System.out.println("You Can not Vote Until You reach 18 ");
		}
		else {
			System.out.println("Congratulations!! You Can Vote and Change the Future");
		}
		
		System.out.println("Main Ends");
		
	}

}
