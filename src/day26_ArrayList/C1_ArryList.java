package day26_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C1_ArryList {

	public static void main(String[] args) {
		
		
		// 1 yol
		ArrayList<String> list1 =new ArrayList<String>(); // import edildi
		System.out.println(list1);
		//2 yol
		ArrayList<String> x2 =new ArrayList<>();
		System.out.println(x2);
		//3 yol		
		List<String> x3 =new ArrayList<>(); // bunu da list den import yapmamiz gerekiyor
		System.out.println(x3);
	}

}
