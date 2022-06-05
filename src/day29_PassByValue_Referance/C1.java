package day29_PassByValue_Referance;

public class C1 {

	public static void main(String[] args) {
		//markette bir musteriye indirimli fiyat uygulayin
		// daha sona fiyati normale alin
double fiyat =100;

	System.out.println("INDIRIMSIZ FIYAT " +fiyat);
	
	indirimKuponu(fiyat);
	 System.out.println("indirim sonrasi : "+fiyat);
	
	}

	private static void indirimKuponu(double fiyat) {
		fiyat=fiyat*0.90;
		System.out.println("indirimli fiyati : "+fiyat);
		
	}

}
