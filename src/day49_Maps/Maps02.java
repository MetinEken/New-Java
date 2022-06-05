 package day49_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps02 {

	public static void main(String[] args) {
		// vereilen bir Stringin icerdigi harfleri ve kacar defa kullanildigini gosteren bir map method u yaziniz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("bir metin giriniz");
		
		String yazi=scan.nextLine();
		
		
		Map<String, Integer> sonucMap = harfSay(yazi);
		System.out.println(sonucMap);
		scan.close();

	}

	public static Map<String, Integer> harfSay(String yazi) {
		
		Map<String, Integer> harfSayisi=new HashMap<>();
		String arr[]=yazi.split("");
		
		for (String each : arr) {
			
			if (!harfSayisi.containsKey(each)) {
				harfSayisi.put(each, 1);
			} else {
				harfSayisi.put(each, harfSayisi.get(each)+1);
			}	
			
		}		
		return harfSayisi;
	}

}
