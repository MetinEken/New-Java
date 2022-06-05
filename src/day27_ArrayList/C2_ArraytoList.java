package day27_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C2_ArraytoList {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5}; // a
		//Array i liste cevirebilmek icin int = Integer yazilmasi gerekiyor
		
		List<Integer> list1 = Arrays.asList(arr);  // Array list e cevrildi
		System.out.println(list1);  
		
		String arr1[]= {"ali", "veli"}; // list dogrudan cevruiliyor
		
		List<String> list2= Arrays.asList(arr1);
		
		System.out.println(list2);
		
		
		
		
		
		

	}

}
