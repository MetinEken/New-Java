package day20_Scope;

public class Scope2 {
	
	
	public String  paylasim2="Paylas";
	public int paylas2 =123;
	
	
	public static void main(String[] args) {
		// bu class dan diger class icindeki objelere ulasabilirim. instace lara......
		Scope1 obj1 = new Scope1();
		System.out.println(obj1.isim+" "+obj1.soyisim); // yazdirirsak diger sayfadaki degeri yazdirir.
														// Mehmet null
		obj1.isim="Ahmet";
		obj1.soyisim="Can";
System.out.println(obj1.isim+" "+obj1.soyisim); // bu sayfadaki atadigimiz yeni degerleri yazdirir. Ahmet Can
	}

}
