package day37_overriding;

public class Isci extends Personel{

	public String bolum="kaynak";
	public int maas=5000;
	public String isim="Metin";
	
	
	public int maasHesapla() {
		return 30*8*15;
	}
	
	public void mesai() {
		System.out.println("isciler gunluk 8 saat calisir1");
		
	}
	
	public int maasHesapla(int gunSayisi) {
		
		return 30*8*15;
	}
	
	
	
	
}
