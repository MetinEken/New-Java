package day05;

public class C4_ConditionalOperator {

	public static void main(String[] args) {
		// and= &&,  or=||
		
		boolean isTrue =5>4 && 7-3>0; // ikiside dogru True
		System.out.println(isTrue); //true
		
		
		int sayi1 =7;
		int sayi2 = 5;
		
		@SuppressWarnings("unused") /// bilmiyorum :)
		boolean is= 5>3 || sayi1<sayi2 ; // t  f = t
		System.out.println(is); // true
		
		System.out.println(1*'a');
		System.out.println(1*'c');

	}

}
