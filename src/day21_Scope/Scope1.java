package day21_Scope;

public class Scope1 {
	
	static String okulId="1234567";
	static String okulAdi="Cumhryt";
	static boolean acikMi=true;	
	public String  paylasim1="Paylas";
	public int paylas =123;

	public static void main(String[] args) {
		
		
		System.out.println(okulId);
		
		staticMethod(); // konu bu degil
		System.out.println(okulAdi);
	}
	
	public static void staticMethod() {
		System.out.println("static method calisti");
		okulAdi="Cmhryte degisti"; //artik okukadi degisti
		System.out.println("ilk degisim sonfrasi C1 den: " + okulAdi);
	}
//method(); // calismaz
	public void method() { //main disinda ve static olmadigi icin bu method calismaz
		okulId="1234";
		System.out.println(okulId);
	}

}
