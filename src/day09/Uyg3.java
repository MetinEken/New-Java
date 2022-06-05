package day09;

import java.util.Scanner;

public class Uyg3 {

	public static void main(String[] args) {
	
		
			Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir harf giriniz");
		
		char h =scan.next().charAt(0);
		
		String snc =(h>='a' && h<='z') || (h>='A' && h<='Z') ? (h>='a' && h<='z') ? "kucuk harf" :"buyuk harf" : "harf degildir";
System.out.println(snc);
scan.close();
	}

}
