package day06;

import java.util.Scanner;

public class C3_IfGun {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gun isminin ilk harfini giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println(ilkHarf);
		if(ilkHarf=='P') {
			System.out.println("pazartesi, persembe,pazar");
		}
		if(ilkHarf=='S') {
			System.out.println("sali");
		}
		if(ilkHarf=='C') {
			System.out.println("cuma, cumartesi, carsamba");
		}
		if(ilkHarf!='P' && ilkHarf!='S' && ilkHarf!='C') {
			System.out.println("lutfen gecerli bir harf yaziniz");
		}
		
		
		
		
		scan.close();
		

	}
	
	

}
