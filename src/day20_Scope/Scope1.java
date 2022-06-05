package day20_Scope;




public class Scope1 {

	
	int yas;
	String isim="Mehmet"; // sayilarin default degeri 0 dir
	String soyisim; // default degeri null
	boolean tatildeMi; // defaul degeri falce
	char ilkHarf='A';  // defaul degeri hiclik
	public String  paylasim2="Paylas";
	public int paylas2 =123;
	public static void main(String[] args) {
		
		staticMethod();
		//int sayi=0;
	//	method();   // calismadi static degil cunku
		Scope1 obj1 = new Scope1(); // Scanner gibi bir obje olusturduk
									// ogretmenler clasi icinde bir ogretmen olusturmak gibi
									// instance variable lari her ogretmen icin kullanabilirim
		
		obj1.soyisim="buyuk";
		obj1.yas=33;
		System.out.println("bir ogretmene ait tum bilgiler asagida verilmistir");
		System.out.println("isim : "+obj1.isim);
		System.out.println("soyisim : "+obj1.soyisim);
		System.out.println("harfi : "+obj1.ilkHarf);
		System.out.println("tatildemi : "+obj1.tatildeMi);
		System.out.println("yasi : "+obj1.yas);
		
		
		
	}
	
	
	public static void staticMethod() {
		System.out.println("static method calisti");
		
	}

	public void method() {
		yas=2;
	}
}
