package basicPrograms;
import java.util.Scanner;
//Find the sum of two integer, long, float and double data values using the concept of 
//method overloading
public class SumMethodOverloading {
	
	 public static void mian(String[] args) {
			System.out.println("Main Starts");
			Scanner input =  new Scanner(System.in);
			boolean exit =true;
			while(exit) {
			System.out.println("Which Data Type you want to add:\n ");
			System.out.println("1.Integer\n 2.Long\n 3.Float\n 4.Double\n 5.Exit\n");
			int choice = input.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter First Integer Value: ");
				int num1 = input.nextInt();
				
				System.out.println("Enter Second Integer Value: ");
				int num2 = input.nextInt();
				
				System.out.println("num1 + num2 = "+add(num1,num2));
			}
			break;
			
			case 2: {
				System.out.println("Enter First Long Value: ");
				long num1 = input.nextLong();
				
				System.out.println("Enter Second Long Value: ");
				long num2 = input.nextLong();
				
				System.out.println("num1 + num2 = "+add(num1,num2));
			}
			break;
			
			case 3: {
				System.out.println("Enter First Float Value: ");
				float num1 = input.nextFloat();
				
				System.out.println("Enter Second Float Value: ");
				float num2 = input.nextFloat();
				
				System.out.println("num1 + num2 = "+add(num1,num2));
			}
			break;
			
			case 4: {
				System.out.println("Enter First Double Value: ");
				double num1 = input.nextDouble();
				
				System.out.println("Enter Second Double Value: ");
				double num2 = input.nextDouble();
				
				System.out.println("num1 + num2 = "+add(num1,num2));
			}
			break;
			
			case 5:{ exit = false;
				System.out.println("Program Exit Successful ");
			}
			break;
			
			default : System.out.println("Invalid Choice");
			
			
			
			}
			}
			System.out.println("Main Ends");
			input.close();
			
		}
		
		public static int add(int a , int b) {
			return (a+b);
		}
		
		public static long add(long a , long b) {
			return (a+b);
		}
		
		public static float add(float a , float b) {
			return (a+b);
		}
		
		public static double add(double a , double b) {
			return (a+b);
		}

		
		

	}



