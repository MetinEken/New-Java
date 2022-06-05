package day33_Encapsulation;



import day20_Scope.Scope2;
import day21_Scope.Scope1;


public class C1 {

	public static void main(String[] args) {
		// baska package lerdeki class lardan obje uretelim,
		
		Scope1 obj = new Scope1();
		obj.paylas=67;
		obj.paylasim1="Metin";
		
		@SuppressWarnings("unused")
		Scope2 obj1 = new Scope2();
		//bulundugumuz class daki static olmayan method lar icin de obje olusturarak cagirabiliriz
		
		C1 obj3 = new C1();
		obj3.deneme(); // asagidaki methodu cagirabildik  

	}

	public void deneme() {
		// main disindaki olusturdugumuz methodlar da da obje uretebiliriz.
		// boylelikle diger class lardaki variable lari ve method lari da kullanabiliriz. 
		Scope2 obj2 = new Scope2();
		obj2.paylas2 =22;
		obj2.paylasim2="ali";
	}
	
	
}
