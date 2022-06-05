 package day14_methodCreation;

public class C1_methodCreation {

	public static void main(String[] args) {
		
		ortalama(85, 60);
	
	

		
 
	}
// parametreleri farkli ayni isimde method olabilir. parametrelere gore methodu tercih eder.
	
	public static void ortalama(double x, double y) {
		// 2li
		System.out.println("sinav ortalamaniz : " + (x=y)/2);
	}
public static void ortalama(double x, double y, double c) {
		//3lu
		System.out.println("sinav ortalamaniz : " + (x=y)/2);
}
	
}
