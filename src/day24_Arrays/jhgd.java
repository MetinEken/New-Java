package day24_Arrays;

import java.util.Arrays;

public class jhgd {
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr)); //yazdirdik
		
		arr[2]=6; // ucuncu elemana yeni atama yaptik, updata,
					// arrays ler index=0 dan baslarrrrrrrrrrrrrrrrrrrr
		System.out.println(arr.length); // uzunlugunu bulduk 5
		
		// ortasindaki elemani degistirelim, eger tek sayili ise ortada eleman var,
		// cift elemana sahipse ortasinda eleman olmaz, 2 tane olur
		// tek iseeeeee
		
		if(arr.length%2==1) {
			int ortaEleman=(arr.length-1)/2; // uzunluk-1/2, tek sayilar 2ye bolunmez cunku
			arr[ortaEleman]=9; // orta elemana update yaptik
						
		}
		System.out.println(Arrays.toString(arr)); // [1,2,9,4,5]
	}

}
