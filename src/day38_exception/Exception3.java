package day38_exception;

public class Exception3 {

	public static void main(String[] args) {
		
	int say1=10;
	int sy2=0;
	
	@SuppressWarnings("unused")
	Exception1  exp = new Exception1();
	
	try {
	System.out.println(say1/sy2);
	} catch (ArithmeticException e) {
		// rtimeticException javad aa bir class
		// e ise olusturdugumuz objenin ismi, herhangi bir sey yazabilir
		// ama genelde e kullanilir
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	
	
	}

}
