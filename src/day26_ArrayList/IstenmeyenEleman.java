package day26_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class IstenmeyenEleman {

	public static void main(String[] args) {
		// istenmeyen elemanlari cikarsin
		int arr[]= {1, 2,3,4,5,6,7,8,9,3,0,11,3,22,33,44,55,66,77,88};
		System.out.println("ilk hali");
		System.out.println(Arrays.toString(arr));
		int sayi=5; // istenmeyen eleman
		
		List<Integer> istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				istenenList.add(arr[i]); // add methoduna bir index degil eklemek istedigimiz elemanin kendisini yaziyoriuz
			} 
		}
		System.out.println("son hali");
System.out.println(istenenList);
	}

}
