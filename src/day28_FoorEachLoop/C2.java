package day28_FoorEachLoop;

public class C2 {

	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		int carpim=1;
		for (int i : arr) {
			carpim*=arr[i];
		}
		System.out.println(carpim);
		
		//NOT : array icinde defaul deger varsa onlarada islem yapar= carpmada sonuc 0 olur
	}

}
