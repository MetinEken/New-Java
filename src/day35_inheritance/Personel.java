package day35_inheritance;

public class Personel {

	
		public String isim;
		public int sayi;
		
		
		public Personel() {
			super(); // child dan geldik buraya, bunun parent i olmadigi icin bu methodu calistirdi,
					// geldigi yere tekrar gitti,
			System.out.println("parents dan parametresiz contructur calisti");
		}
		
		
		
		
		public Personel(String isim, int sayi) {
			super();
			System.out.println("parent dan parametreli contructur calisti");
		}
		
		
		
	

}
