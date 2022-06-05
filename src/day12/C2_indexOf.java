package day12;

import java.util.Scanner;

public class C2_indexOf {

	public static void main(String[] args) {

String str = "JAva ogren isa sahibi ol";

System.out.println(str.charAt(6));

System.out.println(str.indexOf('g'));  // char arama 6

System.out.println(str.indexOf("g")); //string arama 6

System.out.println(str.indexOf("is"));  // coklu kelime arama 11 ilk buldugu sayinin indexi ni alir

										// birden fazla varsa ilk buldugunu getirir
		
		// girilen cumle icerisinde "java" var mi yok mu

// 1 YOL TERNARY
		Scanner scan = new Scanner(System.in);
		
		String cml = scan.nextLine().toLowerCase();
		
		int snc = cml.indexOf("java");
		
		System.out.println(snc>=0 ? "java icerir" : "java icermez");
		
		
// 2 YOL IF
		if(snc>=0) {
			System.out.println("java icerir");
		}else {
			System.out.println("java icermez");
		}
		scan.close();
	}

}
