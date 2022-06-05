package day24_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Uygulama3 {
	public static void main(String[] args) {
		
		//kullanicidan bir Array olusturmasini isteyin
		// once kac elemanli bir array, daha sonra array elemanlarini koyalim
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen olusturmak istediginiz Array in eleman sayisini griniz");
		
		int arrySy=scan.nextInt();
		
		int arr[]=new int[arrySy];
		System.out.println("Array elemanlarini giriniz...");
		
		for (int i = 0; i < arr.length; i++) {// < dersek length-1 demeyiz...args..
			arr[i]=scan.nextInt();
			scan.close();
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // kucukten buyuge siraladi
		System.out.println(Arrays.toString(arr)); // yazdirdik
		
		int arrTers[]= new int[arrySy];
		
		for (int i = 0; i < arr.length; i++) {
			arrTers[arr.length-1-i]=arr[i];
		}
		System.out.println("Tersten : "+Arrays.toString(arrTers));
		
		
		
		scan.next();
	
	
	}

}
