package day35_inheritance;

public class Memur extends Personel{

	public int maas;
	
	public Memur() {
		super(); // parent deki parametresiz constructur a gonderdi
				// personel 13-14 den geldik buraya, asagiya dogru calisacak artik
		System.out.println("Child Class parametresiz const ructur calisti");
	}

	
	
	public Memur(int maas) {
		super("metin", 123); // parent da string ve int olan bir constructur var. itiraz etmiyor. 
		
		System.out.println("Child Class parametreli const ructur calisti");
	}

	
	
	public static void main(String[] args) {
	
Memur obj1 = new Memur(3556); // parametresiz constructur calisti ve 6.satira gittik
obj1.isim="metin";
	}

}
