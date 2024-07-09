package basicPrograms;
//Convert a byte data value to integer data and double data and print it. Widening 
public class ByteWidening {
	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("==============================");
		//byte data 
		byte byteData = 123;
		//widening 
		int intData = byteData;
		double doubleData = byteData;
		System.out.println("==============================");
		System.out.println("original Byte value: "+byteData);
		System.out.println("Respective Integer Value : "+intData);
		System.out.println("Respective Double value : "+ doubleData);
		System.out.println("==============================");
		System.out.println("Main Ends");
		
	}

}
