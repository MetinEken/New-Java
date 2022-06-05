package day44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) {
		
		
		
		List<String> str = new ArrayList<>();
		str.add("ali");
		str.add("veli");
		str.add("deli");
		str.add("Ali");
		str.add("ALI");
		@SuppressWarnings("rawtypes")
		Iterator it1 = str.iterator();
		
		//iterator bir interface dir
		// INDEX YAPISINI DESTEKLEMEYEN LIST YAPILARINDA KULLANILIR 
		// method icindelist de yapilan degisiklikler kaydedilmiyor, set haric
		// iterator method icinde list e yaplina degisiklikleri kaydeder
		// sadece ait oldugu list te obje olusturulur
		// next(), hasnext(), remove() methodlari vardir
		// hasnext() = birsonraki eleman var mi der. varsa true verir
		System.out.println("list oncesi : "+str);
		while(it1.hasNext()) { // eleman oldukca while loop calisacak.
			
			it1.next();
			it1.remove();
						
		}
		
		System.out.println("list sonrasi : "+str);
		
	}

}
