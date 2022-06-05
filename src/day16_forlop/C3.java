package day16_forlop;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		int toplam=0;
		int sy1=scan.nextInt();
		
		
		if(sy1==1) {
	System.out.println("Toplam : 1");
		}else if(sy1<1) {
			for(int i =sy1; i<=1 ; i++) {
				
				toplam+=i;
			}System.out.println("toplam : " +toplam);
		} else if(sy1>1) {
			for(int i =sy1; i>=1 ; i--) {
				
				toplam+=i;
			}System.out.println("toplam : " +toplam);
		}
	scan.close();
	}

}
