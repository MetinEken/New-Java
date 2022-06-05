package day40_Exceptions;

public class Uygulama {

public static void main(String[] args) throws NewMyException  {
		
		String email="ab@gmailcom";
		
		
		mailDogrula(email);
	}

	public static void mailDogrula(String email) throws NewMyException  {
		if(email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println(email);
		}else {
			throw new NewMyException("Email adresi uygum degil");
		}
		System.out.println("exception calisti"); //catch olmadigi icin calismadi
	}

}
