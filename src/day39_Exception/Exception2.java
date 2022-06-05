package day39_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\User\\Java Projects\\New-Java\\src\\day39_Exception\\File");
		int k =0;
		try {
			while ((k=file.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	System.out.println("");	
System.out.println("kod boloke olmadi");
		
	}

}
