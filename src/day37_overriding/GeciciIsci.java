package day37_overriding;

public class GeciciIsci extends Isci{

	public String calistigiBolum="Yemekhane";
	
	public static void main(String[] args) {
		
		//Overriding
		// parent den miras alinan method u degistirmektir.
		GeciciIsci gi1= new GeciciIsci();
		System.out.println(gi1.maasHesapla()); // bu sadece bu class daki methodu kullanir.
												// buradaki kiselerin maas hesaplamasi farkli
		// maas farkli oldugu icin bu class a gore yapmamiz lazim
		// diger turlu herkesin maas hesaplamasi ayni olurdu
		// isci deki maasHesapla method u override olmus oldu, devredisi birakti.
		
		gi1.mesai();
	}
	@Override // bu da overridig
			 // parent deki method ise OVERRIDEN dir
	public int maasHesapla() {
		
		
		return 30*8*10; // 2400 gi maasi
	}

	@Override  // annotation // bu bir aciklamadir, code u inceleyenler icin bilgidir.
				//@Override bu sadece bir aciklama degildir. parents class daki method degisirse java burda cte verir
				//... diger method degisti der. artik overriding olmuyor diyooooorrrr.
				// bunun olmasi tavssiye edilir, degisikligi takip eder. 
	public void mesai() {
		//super.mesai(); eger overriden yapilan method da calismasini istiyorsak super.mesai i de aktif hale getirmek gerekiyor
		// yorum hale getirirsek super calismaz. yani eski methodu calistirmaz. constructer gibi degildir. bu bir method
		System.out.println("gecici isciler haftada 25 saat calisir");
	}
	
	
	
	
}
