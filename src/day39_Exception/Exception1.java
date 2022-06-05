package day39_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {
		// ic ice try catch blok lari olusturabiliriz.
		// ancak birbirini kapsayan exception varsa once chil exception u yazmaliyiz
		//
		
		try {
			try (FileInputStream file = new FileInputStream("C:\\Users\\User\\Java Projects\\New-Java\\src\\day39_Exception\\File")) {
				int k =0;
				
					while ((k=file.read())!=-1) {
						System.out.print((char)k);
					}
			}
		} catch (FileNotFoundException e) { 	// ya dosyayi okuyamazsam exception u 
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		
		} catch (IOException e) { // ya dosyayi bulamazsam exception u
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	System.out.println("");	
System.out.println("kod boloke olmadi");
		
		

	}

}
