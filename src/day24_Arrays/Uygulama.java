package day24_Arrays;

import java.util.Arrays;

public class Uygulama {

	public static void main(String[] args) {
		// bir Array in elemanlarinin hepsini birer sola kaydiralim.
		// bunun icin ilk elemani korumaya almak ve son olarak da birinci elamani sona eklmek lazim
		
		 int arr[]= {1,2,3,4,5,6,7,8,9,0};
		 
		 // ilk elemani korumaya alalim
		 int temp=arr[0]; 
		 int toplam=0;
		 int nrm;
		 for (int i = 0; i < arr.length-1; i++) { // length her zaman 1 fazla sayi verir
			 toplam+=arr[i];
			 nrm=arr[i];// butun elemanlarini topladik
			 arr[i]=arr[i+1]; // her i degistiginde array icindeki tum sayilar degismis olacak,
			System.out.print(+nrm+" ");					// birinci elman silinmis, sonuncu eleman tekrarlanmis olacak
			
		}
		System.out.println("");
		 
		 arr[arr.length-1]=temp; // sonuncu elamanada korudugumuz elamni eklayerek islemi bitiriiyoruz.
		 
		 System.out.println(Arrays.toString(arr)); //{2,3,4,5,6,7,8,9,0,1}
		System.out.println("arayylarin toplami : "+ toplam);
		
		
		
	}

}
