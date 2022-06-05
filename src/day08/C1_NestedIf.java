package day08;

import java.util.Scanner;

public class C1_NestedIf {

	public static void main(String[] args) {
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Cinsiyetinizi giriniz");
		char cins =scan.next().toUpperCase().charAt(0);
		System.out.println("yasinizi giriniz");
		int yas= scan.nextInt();
		
		if(cins=='E')   {
			if(yas>=65) {
				System.out.println("emekli olabilirsiniz");
			}else if(yas<65 && yas>0){
				System.out.println("emekli oamazsiniz");
			} else {
				System.out.println("lutfen gecerli bir yas giriniz");
			}
		}else if(cins=='K') {
			if(yas>=60) {
				System.out.println("emekli olabilirsiniz");
			}else if(yas<65 && yas>0) {
				System.out.println("emekli olamazsiniz");
			}else {
				System.out.println("lutfen gecerli bir yas giriniz");
			}
		}else {
		System.out.println("lutfen gecerli bir cinsiyet giriniz");	
		}
		
		
		scan.close();
		
		

	}

}
