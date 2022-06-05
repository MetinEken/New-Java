package day13;

public class C3_Substring {

	public static void main(String[] args) {
		
		String str = "her ders java gibi olsa";
		
		System.out.println(str.substring(10)); // ilk 10 u almiyor.
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdirir.
		System.out.println(str.substring(0, 10)); // baslangic ve bitis
		

	}

}
