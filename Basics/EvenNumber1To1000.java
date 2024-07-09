package basicPrograms;
//Count and print the number of even numbers between 1 to 1000 using do while loop
public class EvenNumber1To1000 {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		int count =0;
		int num = 1;
		System.out.println("Even Numbers: ");
		do {
			if(num%2==0) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}while(num<=1000);
		System.out.println("Total Even Numbers Between 1 to 1000: "+count);
		System.out.println("Main Ends");
		
	}

}
