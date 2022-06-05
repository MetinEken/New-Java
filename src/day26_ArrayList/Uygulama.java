package day26_ArrayList;

import java.util.Arrays;


public class Uygulama {

	public static void main(String[] args) {
		
		int arr[]= {1, 2,3,4,5,6,7,8,9,3,0,11,3,22,33,44,55,66,77,88};
		
		int count=0;
		int istElmn=3;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==istElmn) {
				count++;
			} 
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("istElmn " +count);
		int arr2[]= new int[arr.length-count];
		System.out.println("arr uzunluk :"+arr.length);
		System.out.println("arr2 uzunluk :"+arr2.length);
		
		
		int count2=0;
			if(count==0) {
			System.out.println("UYARI! : cikartmak istediginiz eleman zaten yoktur...");
		} else {
			
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				
			if (arr[i]!=istElmn) {
				
				arr2[count2]=arr[i]; //arr2 arr den 3 eleman eksik olacagi icin ikisinede 
				count2++;
			}
		}
			
		}
			System.out.println("cikarilmis son hali");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
		

	}

	

}
