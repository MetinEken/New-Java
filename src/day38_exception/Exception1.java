package day38_exception;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alin ve bolumlerini yaziniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen 2 adet tam sayi giriniz");
		int sayi1= scan.nextInt();
		int sayi2=scan.nextInt();
		
		try {
		System.out.println("sayilarin bolumu : "+sayi1/sayi2);
	}catch(ArithmeticException e) {  //matematiksel bir hatayi yakalr, baska exception lar da var.
		System.out.println("sayiyi 0 a bolemezsiniz");
	}
		
		scan.close();
		
	}
}
