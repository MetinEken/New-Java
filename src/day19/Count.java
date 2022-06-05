package day19;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// bir cumle ve bir harf isteyin
		// harf kac defa tekrar etmis bulalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam cumle yaziniz");
		String cml=scan.nextLine();
		
		System.out.println("bir harf veya kelime giriniz");
		
char cml2= scan.next().charAt(0);
	// String.substring(0,1) ile de ilk harfi alabilirz 	
	// St.sub ile yaparsak aramayi .equls ile eslestirme yapmaliyiz
		int count=0;
		
		//int lang=cml.length();
		
		for (int i = 0; i <cml.length(); i++) { // esittir kullanmadigim icin sadece "i<cml.length" kullandik.
			if (cml2==cml.charAt(i)) { // cml2 char oldugu icin == ile eslestirdik.
				count++;
			} 
			
		}
System.out.println("girmis oldugunuz "+cml2+" den "+count+" adet vardir");
scan.close();
	}

}
