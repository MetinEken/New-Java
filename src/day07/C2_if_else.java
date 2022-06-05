package day07;

import java.util.Scanner;

public class C2_if_else {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir harf karakter giriniz");
		
		char harf = scan.next().toLowerCase().charAt(0);
		if (harf>='a' && harf<='z') {
			System.out.println("Harfdir");
		} else {
System.out.println("Harf degildir");
		}
		
scan.close();
	}

}
