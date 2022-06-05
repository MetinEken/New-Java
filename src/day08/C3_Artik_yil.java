package day08;

import java.util.Scanner;

public class C3_Artik_yil {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("yil giriniz");
		 int yil = scan.nextInt();
		 
		 if(yil%100==0) {
			 if(yil%400==0) {
				 System.out.println("artik yildir");
			 }else {
				 System.out.println("artik yil degildir");
			 }
			 
		 }else {
			 if(yil%4==0) {
				 System.out.println("artik yildir");
			 }else {
				 System.out.println("artik yil degildir");
			 }
		 }
		
		
		
		scan.close(); // bu nested if cozumu
		
		
		
		
		

	}

}
