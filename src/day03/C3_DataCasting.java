package day03;

public class C3_DataCasting {
	public static void main(String[] args) {
		
		byte numByte = 34;
		short numShort = numByte;
		int numInt = numShort;
		long numLong = numInt;
		float numFloat = numLong;
		double numDouble= numFloat;
		System.out.println(numByte);
		 System.out.println(numShort);
		 System.out.println(numInt);
		 System.out.println(numLong);
		 System.out.println(numFloat);
		 System.out.println(numDouble);
	}

}
