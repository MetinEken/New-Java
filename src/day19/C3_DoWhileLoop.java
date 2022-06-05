package day19;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int sy=0;
		int toplam=0;
		
		do {
			System.out.println("toplami 200 eden sayi veya sayilar giriniz. kalan : "+(200-toplam));
			sy=scan.nextInt();
			toplam+=sy;
		} while (toplam<200);// eger bu sart saglanmazsa tekrar bsa don
		
		System.out.println("sart saglandi toplam : "+toplam);
		
		scan.close();
	}

}
