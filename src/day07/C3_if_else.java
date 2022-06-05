package day07;

import java.util.Scanner;

public class C3_if_else {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
System.out.println("lutfen Yasinizi giriniz");
	int yas = scan.nextInt();

if (yas>=65) {
	System.out.println("emekli olabilirsiniz");
} else {
System.out.println("emekli oalamazsiniz");
}
		
		
		
	scan.close();	
	}

}
