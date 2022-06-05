package day46_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet2 {

	public static void main(String[] args) {
		// Arraydeki tekrarli elemanlari silip, unique elemanlardan olusan bir array e cevirelim.
		
		int arr[]= {1,2,3,2,3,4,2,4,5,4,5,7,66,6,7,8};
		System.out.println(Arrays.toString(arr));
		
		//tekrarsiz(arr);
		// System.out.println(Arrays.toString(arr3));  // method da olusturulan array local dir.
		// burada dogrudan yazdirilamaz
		// int tekrarsizArray = tekrarsiz(arr); yapabiliriz. retun type da int[] olmalidir
		
		int[] tekrarsizArray = tekrarsiz(arr);
		
System.out.println("en son : "+Arrays.toString(tekrarsizArray));
int fark=(arr.length-tekrarsizArray.length);
System.out.println(fark+" adet eleman tekrar ettigi tespit edildi ve cikarildi .");
	}
	
	private static int[] tekrarsiz(int[] arr) {
		Set<Integer> arr2 =new HashSet<>();
		for (int i : arr) {
			arr2.add(i);
		}
		int count=0;
		int arr3[]= new int[arr2.size()];
		
		for (int i : arr2) {
			arr3[count]=i;
			count++;
		} 
		System.out.println("method icinden : "+Arrays.toString(arr3));		
		
		return arr3;
	}

}
