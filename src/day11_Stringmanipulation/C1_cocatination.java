package day11_Stringmanipulation;

import java.util.Locale;

public class C1_cocatination {

	public static void main(String[] args) {
		String sts1 = "Hello";
		String str2 = "World";
//concat		
		System.out.println(sts1.concat(str2));
		System.out.println(sts1.concat(" "+str2));
		System.out.println(sts1.concat(" ").concat(str2));
//charAt()
		System.out.println(""+sts1.charAt(0)+str2.charAt(0));
		System.out.println(str2.charAt(4));
//toloweCase(Local.forlanguageTag("tr");
//toLowerCase(Local.GERMAN);
		System.out.println(sts1.toLowerCase(Locale.GERMAN));
		String str3 = "kalıip";
		System.out.println(str3.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(str3);

		

	}

}
