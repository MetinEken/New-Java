package day40_Exceptions;

public class NewMyException extends Exception {

	
	
	private static final long serialVersionUID = 1L;
	//yeni bir exception yapmakmicin class isminin sonu exception olan bir class olusturulur
	// parametresi string olan bir construction olusturulur
	NewMyException(String message){
		super(message);
	}
	

}
