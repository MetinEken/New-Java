package day16_forlop;


import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("2 adet tam sayi giriniz");
		
		int sy1=scan.nextInt();
		int sy2=scan.nextInt();
		
		//for (int i = sy1; i<=sy2; i++)
		
		if(sy1<=sy2) {
			for (int i = sy1; i<=sy2; i++) {
				System.out.print(i+" ");
			}
		}else { //sy1>sy2
			for (int i = sy1; i>=sy2; i--) {
				System.out.print(i+" ");
	}
		
			scan.close();	}}
	}
