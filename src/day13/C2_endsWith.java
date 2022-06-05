package day13;

import java.util.Scanner;

public class C2_endsWith {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir email girin");
		
		String gml = scan.next();
		
		if(gml.contains("@")) {
			if(gml.contains("@gmail.com")) {
				if(gml.endsWith("@gmail.com")) {
					System.out.println("basarili");
				}else {
				System.out.println("gecersiz email");
				}
			}else {
				System.out.println("lutfen gmail adresi yaziniz");
			}
		}else {
			System.out.println("girdiginiz bir email degil");
		}
		scan.close();
	}

}
