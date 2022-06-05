package day07;

import java.util.Scanner;

public class C4_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("ucgen kenar1 girin");

double kenar1 = scan.nextDouble();
System.out.println("kenar2 yi girin");
double kenar2 = scan.nextDouble();
System.out.println("kenar3 u girin");
double kenar3 = scan.nextDouble();

if ((kenar1==kenar2 && kenar2==kenar3) && kenar1>0 && kenar2>0 && kenar3>0) {
	System.out.println("eskenar ucgendir");
} else {
System.out.println("eskenar degildir");
}
		
	scan.close();	
		
	}

}
