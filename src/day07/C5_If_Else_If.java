package day07;

import java.util.Scanner;

public class C5_If_Else_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("notunuzu giriniz");
		double not =scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("lutfen gecerli bir not giriniz");
			
		} else if (not<=100 && not >=85){
			System.out.println("notunuz A dir");
			
			
		} else if(not<85 && not>=50) {
			System.out.println("notunuz B dir");
		} else if (not<50 && not >=30) {
			System.out.println("notunuz C dir");
		} else {
			System.out.println("notunuz D dir");
		}
		
		/* 0 dan baslamis
		 * ....
		 else if(not<30){
		 System.out.println("notunuz D dir");
		 } else if(not<50){
		 System.out.println("notunuz C dir");
		 } else if(not<85){
		 System.out.println("notunuz B dir");
		 } else {System.out.println("notunuz A dir");}
		 */
		
		scan.close();

	}

}
