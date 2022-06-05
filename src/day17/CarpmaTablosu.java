package day17;

import java.util.Scanner;

public class CarpmaTablosu {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("carpim tablosu rakam giriniz");
		
		int sy=scan.nextInt();
		
		carTablosu(sy); // hangi rakama kadar tablo istiyoruz
scan.close();
	}

	private static void carTablosu(int x) {
		for (int i = 1; i <=x; i++) {
			for (int j = 1; j <=10; j++) { // 10 lara kdar carpim tablosu
				System.out.print(i*j +" "); // yanyana yazdiracak ve araya bir bosluk verecek
			}
			System.out.println(""); // her bir rakam tablosu bitince alt satira gececek
		}
		
		
	}

}
