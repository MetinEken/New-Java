package day15_MethodCreation;

import java.util.Scanner;

public class M_Creation1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("bir sayi giriniz");
		
		double sy=scan.nextDouble(); // int olsa iyi olabilirdi
		
		pozitifNegatif(sy);
		temiCiftmi(sy);
		
		
		if(sy<100) {
			yzKck(sy);
		}else {
			YzByk(sy);
		}
scan.close();
	}

	private static void yzKck(double x) {
		System.out.println(x%10);
		
	}

	private static void YzByk(double x) {
// 3 basamakli ise rakamlar toplamini ver
int y=0;
y=(int) x%10;  // birler basamagini bulduk ve y ye ekledik
x/=10;	// sayiyi bir basamak azalttik
y+=x%10;	// sayinin onlar basamagini y ye ekledik
y+=x/10; 	// 2 basamakli kalan sayiyi 10 a bolup onlar(yuzler) basamaginidaki sayiyida y ye ekledik
			// boylece 3 basamakli bir sayinin rakamlar toplamini bulmus olduk
			// sayi 4 basamakli olursa son 3 basamagina islem yapar

		System.out.println("rakamlar toplami : " +y);
	}

	private static void temiCiftmi(double x) {
		System.out.println(x%2==0 ? "sayi cifttir" : (x%2==1 ? "sayi tekdir" : "sayi ondaliklidir"));
		
	}

	private static void pozitifNegatif(double x) {
		
	System.out.println(x<0 ?  "sayi negatiftir" : (x==0 ? "sayi notur " : "sayi pozitifdir" ));	
		
	}


	
}
