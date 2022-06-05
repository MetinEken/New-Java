package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// kalan %
		
		int sayi = 26;
		 System.out.println(sayi %10); //kalan 6 dir. birler basamagidir.
		
		System.out.println(sayi %2); // sonuc 1 ise sayi tektir, 0 ise sayi cifttir =0 cift
		
		int num=856;
		// sayinin birler onlar ve yuzler basamagini bulalim
		
		int birlerBasamagi =num%10;
		System.out.println("birler basamagi : " + birlerBasamagi); //
		
		 num = num/10;
		int onlarBasamagi=num%10;
		System.out.println("onlar basamagi ; " +onlarBasamagi);
		num= num/10;
System.out.println("yuzler basamagi ; " +num);		
		
		
		
	}

}
