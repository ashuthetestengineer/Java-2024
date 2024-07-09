package basicPrograms;
import java.util.Scanner;

//Find the area of circle, rectangle, and square using concept of method overloading,
//switch and do while loop
public class GeometryArea {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("Select the Option to Find Area :");
			System.out.println("\n 1.Area Of Circle\n 2.Area Of Rectangle\n 3.Area Of Square\n 4.Exit Program");
			int choice = input.nextInt();
			switch(choice) {
			case 1: { 
				System.out.println("Enter the radius of circle : ");
				double radius = input.nextDouble();
				System.out.println("Area of Circle with radius :"+ radius + " is = \n"+area(radius));
				System.out.println("===============================================================");
			    
				
			}
			break;
			
			case 2: {
				System.out.println("Enter the length of Rectangle: ");
				float length = input.nextFloat();
				System.out.println("Enter the Breadth of Rectangle : ");
				float breadth = input.nextFloat();
				System.out.println("Area OF Rectangle For Given Length and Breadth:\n "+area(length, breadth));
				System.out.println("===============================================================");
				
			}
			break;
			
			case 3 : {
				System.out.println("Enter the length of Side of Square : ");
				int side = input.nextInt();
				System.out.println("The area of square is : \n"+area(side));
				System.out.println("===============================================================");
			}
			break;
			
			
			case 4:{
				exit = false;
				System.out.println("Program Exit Success: ");
			}
			
			default : System.out.println("Invalid Choice ");
			
			}
		}
		System.out.println("Main Ends");
		input.close();
		
		
	}
	
	public static double area(double r) {
		return (3.14*r*r);
	}
	
	public static int area(int s) {
		return (s*s);
		
	}
	
	public static float area(float l, float b) {
		return(float)(l*b);
		
	}

}
