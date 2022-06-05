package day28_FoorEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C4 {

	public static void main(String[] args) {
		// ortak elemanlari bulur getirir.
		List<Integer> list = new ArrayList<>();
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(62);
		list.add(75);
		list.add(8);
		list.add(90);
		list.add(0);
		List<Integer> ortak = new ArrayList<>();
		
		for (int i : arr) {
			for (int j : list) {
				if(i==j) {
					ortak.add(j);
				}
			}
			
		}
		System.out.println(list);
		System.out.println(Arrays.toString(arr));
		
		if (ortak.isEmpty()) { // veya ortak.size==0
			System.out.println("ortak eleman bulunamadi.....");
		} else {
			System.out.println("ortak elemanlar : "+ortak);
		}
		
	}

}
