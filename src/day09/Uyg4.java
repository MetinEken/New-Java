package day09;

import java.util.Scanner;

public class Uyg4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir harf giriniz");
		
		int say = scan.nextInt();
		
		String snc = (say>-1000 && say<-99) || (say>99 && say<1000) ?  say +" : uc basamaklidir" : say+" : uc basamakli degildir" ;

				System.out.println(snc);
				
				scan.close();
				
				
	}

}
