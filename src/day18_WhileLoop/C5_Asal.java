package day18_WhileLoop;

public class C5_Asal {

	public static void main(String[] args) {
		// Asal bulma
		
		int sy=71;
		
		int count=0;
		
		for (int i = 1; i <sy; i++) {
			if(sy%i==0)
			count+=i;
		}
if(count>1) {
	System.out.println("sayi asal degildir");
}else {
	System.out.println("sayi asaldir");
}
	}

}
