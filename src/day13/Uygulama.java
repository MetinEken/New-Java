package day13;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		String sy1="$13.99";
		String sy2="$10.55";
		
		
		sy1=sy1.replaceAll("\\D", "");
		sy2=sy2.replaceAll("\\D", "");
		
		double rk1= Double.parseDouble(sy1);
		double rk2= Double.parseDouble(sy2);
		
		double tplm=(rk1+rk2)/100;
		
		System.out.println("toplam : $"+tplm);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir kelime giriniz");
		String cml = scan.nextLine();
		
		if(cml.length()<4 || cml.length()>4) {
			System.out.println("lutfen 4 basamakli giriniz");
		}else {
			System.out.print(cml.substring(3));
			System.out.print(cml.substring(2, 3));
			System.out.print(cml.substring(1, 2));
			System.out.println(cml.substring(0, 1));
		}
			
		scan.close();

	}

}
