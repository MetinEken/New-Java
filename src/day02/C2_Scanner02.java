package day02;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dairenin yari capini giriniz");
		
		double yariCap = scan.nextDouble();
		
		System.out.println("dairenin alani = "+3.14*yariCap*yariCap);
		
		System.out.println("lutfen isminizi ve soyisminizi yaziniz...");
		String name = scan.nextLine();// kullanicinin girdigi tek kelimeyi alir, diger kelimeleri almaz.
		String sorName = scan.nextLine();
		
		
		System.out.println(name +" " + sorName);
		scan.close();
	}

}
