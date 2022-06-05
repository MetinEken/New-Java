package day27_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama_fibo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("bir sayi giriniz");
	
	int sy=scan.nextInt();
	int sy2=scan.nextInt();
	
int toplam=2;
List<Integer> fibo= new ArrayList<>();
fibo.add(1);
fibo.add(1);
int count=1;
	while (toplam<=sy) {
		toplam=fibo.get(count-1);  // listteki bir onceki degeri atatid
		toplam+=fibo.get(count);	// bir sonrakinde de topladik
		if(toplam<=sy) {
			fibo.add(toplam);
			count++;
		}
		
	}
	System.out.println(fibo);
System.out.println("fibonacci degerleri : ");
System.out.println();
List<Integer> fibo2= new ArrayList<>();
fibo2.add(1);
fibo2.add(1);
System.out.println(fibo2);
	for (int i =2; fibo2.get(i-2)+fibo2.get(i-1) <=sy2 ;i++) {
		fibo2.add(fibo2.get(i-2)+fibo2.get(i-1));
	}
	System.out.println("fibo2  degerleri : ");
	System.out.println(fibo2);
	
	scan.close();
	}

}
