package basicPrograms;
//Convert a double data value to float and byte data value and print it. Narrowing
public class DoubleNarrowing {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		//double data value
		double doubleData = 7659.9876543;
		//Narrowing
		float floatData = (float)doubleData;
		byte byteData = (byte)doubleData;
		
		System.out.println("Original Double Data :"+doubleData);
		System.out.println("Respective Float Data : "+floatData);
		System.out.println("Respective Byte Data: "+byteData);
		System.out.println("Main Ends");
		
	}

}
