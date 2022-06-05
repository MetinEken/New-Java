package day19;

import java.util.Scanner;

public class Flag {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam cumle yaziniz");
		String cml=scan.nextLine();
		
	int index=0;	
	String flag = "yok";
	
	while (index<cml.length()) { // bir kucuktur harfi yarim saat ugrastirdi
		
		if(cml.charAt(index)>='A' && cml.charAt(index)<='Z') {
			flag = "var";
			
		}
		index++;
		
	}
System.out.println("cumlede buyuk harf "+ flag);
scan.close();
	}

}
