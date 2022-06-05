package day31;

public class C2_StringBuilder {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 : ");
		StringBuilder sb2 = new StringBuilder("Mehmet");
		System.out.println("sb2 : "+ sb2);

		StringBuilder sb3 = new StringBuilder(10); //10 karakterli olustu
		System.out.println("sb3 : "+ sb3);
		
		sb1.append("Hoca");
		System.out.println("sb1 : "+ sb1);
		sb2.append("Hoca");
		System.out.println("sb2 : "+ sb2);
		
		System.out.println("sb2 length : "+sb2.length()); // 10
		System.out.println("capacity : " +sb2.capacity()); //22    

		System.out.println("sb1 length : "+sb1.length()); // 4
		System.out.println("sb1 capacity : " +sb1.capacity()); //16 kendi hesabina gore artiriyor,
		// hafiza yonetimi icin ilk basta uzunlugu ongerebildigimiz kadar dogru uzunluk girmeliyiz
		// gereksiz yer kaplamasi yapabilir.
		sb2.deleteCharAt(0);
		System.out.println("sb2 : "+ sb2);
		sb2.delete(0, 2);
		System.out.println("sb2 : "+ sb2);
	}
	}


