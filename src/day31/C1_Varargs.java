package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1_Varargs {

	public static void main(String[] args) {
		// 
List<Integer> list= new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(62);
list.add(75);
list.add(8);
list.add(90);


int arr[]=new int[list.size()]; // varargs lar list kabul etmiyorlar,
								// bunun icin array e cevirdik
int x=0;
for (int i : list) {
	arr[x]=i;
	x++;
}

	System.out.println(Arrays.toString(arr));
	System.out.println(list);

	toplama(arr);
System.out.println("toplama : "+toplama( arr));
	}

	

	private static int toplama(int...var) {
		
		int toplam=0;
		for (int i : var) {
			toplam+=i;
		}
		
		
		return toplam;
	
		
	}

}
