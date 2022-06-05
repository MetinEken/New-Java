package day10;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("lutfen ogrenmek istediginiz harfi giriniz");
			String hr=scan.next();
			// char h = hr.charAt(0);


switch (hr) {
case "v":
	System.out.println("very");
	break;
case "i":
	System.out.println("important");
	break;
case "p":
	System.out.println("personel");
	break;
	default:
		System.out.println("gecersiz harf");}
scan.close();
	}

}
