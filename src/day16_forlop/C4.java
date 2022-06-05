package day16_forlop;

public class C4 {

	public static void main(String[] args) {
		
		int toplam=0;
		for (int i = 51; i <150; i++) {
			
			if(i%7==0) {
				  toplam=+i;
			}
			
		}
		System.out.println("%7 toplamlari : " +toplam);
		
		
	}

}
