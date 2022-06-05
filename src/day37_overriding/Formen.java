package day37_overriding;

public class Formen extends Isci{

	public String sorumluOlduguBolum="Bakim";
	public String isim="Ali";
	public static void main(String[] args) {
		
		
		//Inheritance da data turu olarak class ismi kullanalim
		// hangi class dan obje uretilmis ise, class ismi objenin data turu olmus olur.
		// String de aslinda bir class ismidir, integer... gibi
		
		
		Formen fr1 = new Formen();
		fr1.sorumluOlduguBolum="MarangozHane";
		fr1.maas=6000;
		
		 
		Isci fr2 = new Formen();
System.out.println(fr2.isim); // isci den olusturuldugu icin, isci de atanan ismi yazar. bu class i atlar.


	}

}
