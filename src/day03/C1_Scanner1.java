package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz");
		
	String name =scan.nextLine();	
	System.out.println("soyisminizi yaziniz");
	String sorName =scan.nextLine();
	System.out.println("isminiz : "+name +" soyisminiz : "+sorName);
System.out.println("	Isminizin ilk harfini giriniz");
	
	char ilkHarf = scan.next().toUpperCase().charAt(0);
	System.out.println("isminizin ilk harfi : "+ilkHarf);
	scan.close();
	}

}
