package day09;

public class Uygulama {

	public static void main(String[] args) {
		
		
		int y=1;
		int z=1;
		int a=(y<10)? y++ : z++; // once y yazdirir ve y 1 olur, a da 1 olur
								// bu satirda y 2 olur
		
		System.out.println(y+","+z+","+a); // 2,1,1 olur
	}
	
	
}
