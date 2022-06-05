package day28_FoorEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(0);
		// for dongusunun daha basiti
		// baslangic ve bitis degeri yok, hepsini getirir. basdan baslar
		//
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		for (int i : list) {
			System.out.print(i+" ");
		}
	}

}
