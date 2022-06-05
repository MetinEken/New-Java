package day08;

import java.util.Scanner;

public class C2_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		System.out.println("yil giriniz");
		 int yil = scan.nextInt();
		
		if(yil%4==0 && yil%100!=0  ) {
			System.out.println(yil +" : Artik yildir");
			
		}else if(yil%400==0){
			System.out.println(yil +" : Artik yildir");
		}else {
			System.out.println(yil +" : artik yil degildir");
		}
scan.close(); // bu if statement cozumu,
}
}