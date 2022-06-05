package day06;

import java.util.Scanner;

public class C5_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin bir kenar uzunlugunu griniz");
		double kose1 = scan.nextDouble();
		System.out.println("lutfen dikdortgenin diger kenar uzunlugunu griniz");
		double kose2=scan.nextDouble();
		if(kose1==kose2 && kose1!=0 && kose2!=0 && kose1>0 && kose2>=0) {
			System.out.println("bu bir karedir");
		}
		if(kose1!=kose2) {
			System.out.println("bu bir kare degildir.");
		}
		if(kose1<=0 || kose2<=0 ) {
			System.out.println("lutefen gecerli bir uzunluk giriniz");
		}
		scan.close();
	}

}
