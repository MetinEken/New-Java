package day17;

import java.util.Scanner;

public class C5_NestedForLoop {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("0 haric bir rakam giriniz");
		
		int sy=scan.nextInt();
		if(sy<=0 || sy>9) {
			System.out.println("0 haric bir rakam giriniz");
		}else {
			sekil(sy);
		}
		scan.close();

	}

	private static void sekil(int x) {
		
		for (int i = 1; i <=x; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
	}

}
