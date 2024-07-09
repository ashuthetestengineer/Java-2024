package basicPrograms;
//Print “Java-OOPs” 6 times using while loop
public class WhileMessage {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int loop = 1;
		while(loop<=6) {
			System.out.println("Iteration Number : "+loop);
			System.out.println("MESSAGE : " + "Java-OOPs");
			System.out.println("============================");
			loop++;
			
		}
		System.out.println("Main Ends");
	}

}
