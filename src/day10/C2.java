package day10;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("lutfen kacinci ayda oldugumuzu giriniz");
			String gun = scan.next().toLowerCase();
			
			
		
			switch (gun) {
			case "pazartesi":
			case "sali":
			case "carsamba":
			case "persembe":
			case "cuma" :
				System.out.println("hafta ici");
				break;
			case "cumartesi":
			case"pazar":
				System.out.println("hafta sonu");
				break;
				default:
					System.out.println("lutfen gecerli bir gun girin");
			}
scan.close();
	}

}
