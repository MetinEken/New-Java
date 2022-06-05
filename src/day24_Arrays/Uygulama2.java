package day24_Arrays;

public class Uygulama2 {

	public static void main(String[] args) {
		
		
		short arr[]= new short[4];
		
		arr[0]=10;
		arr[1]=11;
		arr[3]=13;
		
		System.out.println(arr); // referans verir
		
		System.out.println(arr[2]); // degeri yazdirir. olmadigi icin defaault deger yazdirir = 0
		System.out.println(arr[0]); // sadece degeri yazdirir = 10
		

	}

}
