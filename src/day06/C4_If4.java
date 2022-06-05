package day06;

import java.util.Scanner;

public class C4_If4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun ismi giriniz");
		String gun = scan.next().toUpperCase();
	/*	if(gun == "PAZARTESI" || gun =="SALI" || gun == "CARSAMBA" || gun == "PERSEMBE" || gun =="CUMA" ) {
			System.out.println("HAFTA ICI"); ........... CALISMAAAAAZZZZZZZZ .equals() kullanmamiz gerekiyor
		}  */
		
		
		if(gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") || gun.equals("PERSEMBE")
				|| gun.equals("CUMA")) {
			System.out.println("hafta ici");
		}
		
		if(gun.equals("PAZAR") || gun.equals("CUMARTESI")) {
			System.out.println("HAFTA SONU");
		}
		System.out.println("TESEKKUR EDERIZ");
		scan.close();
		
	}

}
