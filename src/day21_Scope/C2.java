package day21_Scope;

public class C2 {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Scope1.okulAdi);
		Scope1.okulAdi="degisti okuladi";
		System.out.println("okulun adi degisti : "+Scope1.okulAdi);
		Scope1.staticMethod(); //C1 de ki methodu calistirr, orada okul adi degismisti. degistirr buraya da atar.
		System.out.println("tekrar C2 den "+Scope1.okulAdi); // okul adi yukardaki method calistigi icin tekrar degisti. artik bu 
										// okuladi gecerli. bi dahaki degisime kadar
	}

}
