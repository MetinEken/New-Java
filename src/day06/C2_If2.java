package day06;

import java.util.Scanner;

public class C2_If2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bi tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		if(sayi%2 ==1 || sayi%2==-1) {
			System.out.println("girdiginiz sayi bir TEK sayidir");	
			
		}
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi CIFT sayidir.");
		}
		System.out.println("Katildiginiz icin tesekkur ederiz...");
		
		
		scan.close();
	}

	

}
