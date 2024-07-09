package basicPrograms;
//Print arithmetic sequence from 1 to 100 using common difference of 4 using for loop
public class APUsingForLoop {
	public static void main(String [] args) {
		System.out.println("Main Start");
		System.out.println("Arithmetic sequence from 1 to 100 using common difference of 4:");
		
		for(int num=1;num<=100;num+=4) {
			System.out.println(num);
		}
		System.out.println("Main Ends");
	}

}
