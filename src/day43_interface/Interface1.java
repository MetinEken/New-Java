package day43_interface;

public interface Interface1 {

	default void deneme() {
		System.out.println("defaul void deneme");
	}
	
	
	static void deneme2() {
		System.out.println("static void deneme2");
	}
	
	
}
