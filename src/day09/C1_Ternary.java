package day09;

public class C1_Ternary {

	public static void main(String[] args) {

		int sayi = 18;
		
		String sonuc= sayi%2==0 ? "Cift sayi" : "Tek sayi";
		
		System.out.println(sonuc);

		// veya
		
		System.out.println("syso icerisine ternary yazdik "+ (sayi%2==0 ? "Cift sayi" : "Tek sayi"));
		
		

	}

}
