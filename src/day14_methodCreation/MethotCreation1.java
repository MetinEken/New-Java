package day14_methodCreation;

public class MethotCreation1 {

	public static void main(String[] args) {
		
		toplama(60.4, 50);
		
		
		// ilk once bire bir uyan methodu calistirir
		// bulamazsa yazdirabilecegi ilk methodu calistirir.
		

	}

	public static void toplama(int say1, int say2) {
		System.out.println("int toplam : " + (say1+say2)/2);
	}
	
	public static void toplama(double say1, double say2) {
		System.out.println("double toplam : " + (say1+say2)/2);
	}
	public static void toplama(double say1, int say2) {
		System.out.println("double-int toplam : " + (say1+say2)/2);
	}
	public static void toplama(char say1, char say2) {
		System.out.println("char toplam : " + (say1+say2)/2);
	}
	public static void toplama(String say1, String say2) {
		System.out.println("String toplam : " + (say1+say2));
	}
	
	
}
