package day40_Exceptions;

import java.util.Scanner;

public class Exception1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (yas>=0) {
			System.out.println("yasini : "+yas);
		} else if(yas<0){
			throw new IllegalArgumentException();
		}
		
		System.out.println("code blok olmadi");
		scan.close();
	}

}
