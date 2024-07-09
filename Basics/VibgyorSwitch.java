package basicPrograms;
//Declare and initialize an integer variable and Using switch statement with parameter variable + 2
//print the color of VIBGOYR
public class VibgyorSwitch {
	public static void main(String [] args) {
		System.out.println("Main Start");
		int  col1 = 1;
		switch(col1+2) {
		case 1 : System.out.println("Color is Violet");
		break;
		
		case 2 : System.out.println("Color is Indigo");
		break;
		
		case 3 : System.out.println("Color is Blue");
		break;
		
		case 4 : System.out.println("Color is Green");
		break;
		
		case 5 : System.out.println("Color is Yellow");
		break;
		
		case 6 : System.out.println("Color is Orange");
		break;
		
		default: System.out.println("Color is Red");
		
		
		
		}
		System.out.println("Main Ends");
		
	}

}
