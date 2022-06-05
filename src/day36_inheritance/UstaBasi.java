package day36_inheritance;

public class UstaBasi extends Isci{
	
	public String bolum="takimBasi";
	public int sorOlIsci=10;
	
	

	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.departman);
		System.out.println(ub1.isim);
		System.out.println(ub1.soyIsim);
		System.out.println(ub1.izindeMi);
		
		Isci ub2 = new UstaBasi();
		ub2.id=1234;
		//ub2.bolum="";  // Isci class indan basladigi icin ustabasi daki variable ve method  lara ulasamayiz 
	}

}
