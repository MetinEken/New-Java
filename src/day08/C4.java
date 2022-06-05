package day08;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("sifre giriniz");
		String sif = scan.next();
		 
		 char ilkH=sif.charAt(0);
		 
		 
		 if(ilkH=='A' || ilkH=='z') {
			
			 System.out.println("sifre gecerli");
			 
		 }else {
			 System.out.println("sifre gecersiz");
			 
		 }
		 
		 scan.close();

	}

}
