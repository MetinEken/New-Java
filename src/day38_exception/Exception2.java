package day38_exception;

import java.util.Scanner;

public class Exception2 {
public static void main(String[] args) {
	
	
	int count=0;
	int ht=1;
	Scanner scan = new Scanner(System.in);
	while(count<100) {
	System.out.println("lutfen 2 adet tam sayi giriniz");
	int sayi1= scan.nextInt();
	int sayi2=scan.nextInt();
	System.out.println("islem no : "+ count);
	count++;
	try {
	System.out.println("sayilarin bolumu : "+sayi1/sayi2);
}catch(ArithmeticException e) {  //matematiksel bir hatayi yakalr, baska exception lar da var.
	System.out.println("sayiyi 0 a bolemezsiniz");
	System.out.println("hata sayisi : "+ht);
ht++;
}
	}
	scan.close();
	
	
}
}
