package day18_WhileLoop;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki adet harf giriniz");
		System.out.println("birinci harf : ");
		
		char hr1=scan.next().toUpperCase().charAt(0);
		System.out.println("ikinci harf : ");
		char hr2=scan.next().toUpperCase().charAt(0);
		
	/*	System.out.println("forLoop ile cozumu");
		for (int i = hr1; i<=hr2; i++) {
			System.out.print(hr1 +" ");
			hr1++;
		} */
	 	
System.out.println("while loop ile cozumu");

while (hr1<=hr2) {
	
		System.out.print(hr1 +" ");
		hr1++;}	

scan.close();
}
	
	}
