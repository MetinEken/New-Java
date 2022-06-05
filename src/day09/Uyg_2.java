package day09;

import java.util.Scanner;

public class Uyg_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen uzunluklari giriniz");
		
		double y =scan.nextDouble();
		double z = scan.nextDouble();
		
		String snc =(y>0 && z>0 ? (y==z ? "kare" : "kare degil") : "gecersiz kenar uzunluk");
		 
		System.out.println(snc);
		
		scan.close();

	}

}
