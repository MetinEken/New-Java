package day34_inheritance;

public class Isci extends Muhasebe{

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		isci1.isim="Metin";
		isci1.soyisim="Eken";
		isci1.id=1001;
		isci1.saatUcreti=100;
		isci1.izindeMI=true;
		isci1.statu="Boss";
		isci1.maas=isci1.maasHesapla(); 
		
		
		

	}

}
