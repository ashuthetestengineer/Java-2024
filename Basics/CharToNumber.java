package basicPrograms;
//Take two characters ‘d’ and ‘P’ and convert them in each primitive number
//data type and then print

public class CharToNumber {
	
	public static void main (String[] args) {
		System.out.println("Main Starts");
		System.out.println("==================================");
		char value1 = 'd';
		char value2 ='P';
		//Type-casting First Character 
		byte byteData1 = (byte)value1;
		short shortData1 = (short)value1;
		int intData1 = value1;
		long longData1 = value1;
		float floatData1 = value1;
		double doubleData1 = value1;
		System.out.println("First Character : "+value1);
		System.out.println("==================================");
		System.out.println("Byte value of d : "+byteData1);
		System.out.println("Short value of d : "+shortData1);
		System.out.println("Integer value of d : "+intData1);
		System.out.println("Long value of d : "+longData1);
		System.out.println("Float value of d : "+floatData1);
		System.out.println("Double value of d : "+doubleData1);
		System.out.println("==================================");
		byte byteData2 = (byte)value2;
		short shortData2 = (short)value2;
		int intData2 = value2;
		long longData2 = value2;
		float floatData2 = value2;
		double doubleData2 = value2;
		System.out.println("Second Charecter :"+value2);
		System.out.println("==================================");
		System.out.println("Byte value of P : "+byteData2);
		System.out.println("Short value of P : "+shortData2);
		System.out.println("Integer value of P : "+intData2);
		System.out.println("Long value of P : "+longData2);
		System.out.println("Float value of P : "+floatData2);
		System.out.println("Double value of P : "+doubleData2);
		
		
		System.out.println("Main Ends");
		
	}

}
