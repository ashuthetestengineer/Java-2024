package basicPrograms;
/*
 * Covert byte value of 125 in short, integer,long, float and double data types
 * then convert each above data value in respective character data value
 */
public class NumberToChar {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("==========================================");
		byte byteData = 125;
		System.out.println("Original Byte Data : " + byteData);
		System.out.println("==========================================");
		System.out.println("Byte data to Other Number data types:");
		System.out.println("==========================================");
		short shortData = byteData;
		System.out.println("Respective Short Data :"+shortData);
		int intData = byteData;
		System.out.println("Respective integer Data :"+intData);
		long longData = byteData;
		System.out.println("Respective long Data :"+longData);
		long floatData = byteData;
		System.out.println("Respective Float Data :"+floatData);
		double doubleData = byteData;
		System.out.println("Respective Double Data :"+doubleData);
		System.out.println("==========================================");
		System.out.println("Numbers to Char Data: ");
		System.out.println("==========================================");
		System.out.println("Char Data for Byte Value :"+(char)byteData);
		System.out.println("Char Data for Short Value :"+(char)shortData);
		System.out.println("Char Data for Integer Value :"+(char)intData);
		System.out.println("Char Data for Long Value :"+(char)longData);
		System.out.println("Char Data for Float Value :"+(char)floatData);
		System.out.println("Char Data for Double Value :"+(char)doubleData);
		
		
		
		System.out.println("Main Ends");
	}

}
