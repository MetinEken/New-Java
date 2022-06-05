package day08;

import java.util.Scanner;

public class If_Uygulama {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("gun ismi giriniz");
		String gun =scan.nextLine().toLowerCase();
		
		if(gun.equals("pazartesi") || gun.equals("pazar")  ) {
			System.out.println("Paz");
			
		} else if(gun.equals("sali")) {
			System.out.println("Sal");
		}else if(gun.equals("carsamba")) {
			System.out.println("Car");
		}else if(gun.equals("persembe")) {
			System.out.println("Per");
		}else if(gun.equals("cumartesi") || gun.equals("cuma")) {
			System.out.println("Cum");
		}else  {
			System.out.println("Lutfen gecerli bir gun ismi giriniz");
		}
		
		scan.close();
		
		
		
	}

}
