package day17;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("bir yazi giriniz");
		
		String yz=scan.nextLine();
		String trs="";
		for (int i = yz.length()-1; i >=0; i--) {
			trs+=yz.charAt(i);
			System.out.print(yz.charAt(i)); // birinci yontem , direkt yazdir, atama yapmaz
			
			
		}
		System.out.println("");
	System.out.println("girdiginiz sayinin teersi : "+trs);
	
	ters(yz);
	
	
	scan.close();
	}

	private static void ters(String x) {
		System.out.println("method olusturularak tersten yazdirilmasi");
		for (int i = x.length()-1; i >=0; i--) {
			
			System.out.print(x.charAt(i)); // birinci yontem , direkt yazdir, atama yapmaz
			
			
		}
		
	}

}
