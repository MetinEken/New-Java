package day42_Abstractclasses;

public class C2_final extends C1_Final{

	public static void main(String[] args) {
		System.out.println(C1_Final.SAYI); // bold ve buyuk olarak geldi, static oldugu icin
											// ama degisirilemez
		
		
		C2_final obj = new C2_final();
		
		obj.deneme();
	}

	public void deneme() {
		System.out.println("child class daki overrriding method calisti");
	}

//	public void deneme2() {
//		System.out.println("dneme2 final calisti");
//	}
// parents class da final oldugu icin overridding yapilamadi CTE verdi.	
	
}
