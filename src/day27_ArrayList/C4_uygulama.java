package day27_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C4_uygulama {

	public static void main(String[] args) {
		// verilen lstedeki tekrarlari silip, tekrar bir array veya list olusturalim
		
		int arr[]= {1,2,3,4,5,6,7,8,9,01,2,4,2,2,43,6,3,7};
		System.out.println("onceki : "+Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) { // icermiyorsa
				list.add(arr[i]); 
			} else {
				list2.add(arr[i]);
			}
		}
 System.out.println("sonraki : "+list);
 System.out.println("tekrarlar : " +list2);
	}

}
