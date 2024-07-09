package basicPrograms;
//Print all odd numbers from 500 to 800 and total count using for loop
public class OddFor {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int count =0;
		System.out.println("all odd numbers from 500 to 800: ");
		for(int num=500;num<=800;num++) {
			if(num%2!=0) {
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Total Odd Numbers are :" + count);
		System.out.println("Main Ends");
	}

}
