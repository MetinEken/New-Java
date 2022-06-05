package day18_WhileLoop;

import java.util.Scanner;

public class C5_Asal_devam {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		
		
		int sy=scan.nextInt();
		
		String flag="Asal";
		
		int bolen=2;
		
		while(bolen<sy) {
			if (sy%bolen==0) {
				flag="Asal sayi degildir";
				
			} 
			bolen++;
		}
		System.out.println(flag);
		scan.close();
	}

}
