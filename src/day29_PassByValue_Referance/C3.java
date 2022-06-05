package day29_PassByValue_Referance;

import java.util.ArrayList;
import java.util.List;

public class C3 {

	public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5); 
		list.add(62);
		list.add(75);
		list.add(8);
		list.add(90);
		
		 System.out.println("Normal"+list);
		 degistir(list);
		 
		 System.out.println("method sonrasi : " +list);
		 //medhod da YAPILAN DEGISIKLIKLER LIST I DEGISTIRMEDI
		 //list.set()	 istisna
		 
	}

	public static void degistir(List<Integer> list) {
		for (Integer x : list) {
			x=+3;
			System.out.print(x);
		}
		System.out.println("");
	}

}
