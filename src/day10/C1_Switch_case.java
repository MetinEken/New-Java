package day10;

import java.util.Scanner;

public class C1_Switch_case {

	public static void main(String[] args) {
		
		
     Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen kacinci ayda oldugumuzu giriniz");
		int ay = scan.nextInt();
		
		switch (ay) {
		case 1:
		System.out.println("ocak");
		break;
		case 2:
			System.out.println("subat");
			break;
		case 3:
			System.out.println("mart");
			break;
			case 4:
				System.out.println("nisan");
				break;
			case 5:
				System.out.println("mayis");
				break;
				case 6:
					System.out.println("haziran");
					break;
				case 7:
					System.out.println("temmuz");
					break;
					case 8:
						System.out.println("agustos");
						break;
					case 9:
						System.out.println("eylul");
						break;
						case 10:
							System.out.println("ekim");
							break;
							default:
								System.out.println("gecerli bir ay numarasi giriniz");
		}
scan.close();
	}

}
