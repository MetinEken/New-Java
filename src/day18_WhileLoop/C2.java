package day18_WhileLoop;

public class C2 {

	public static void main(String[] args) {
		
		int sy=100;
		System.out.print("for loop cozumu : ");
	for (int i =sy; i <1000; i++) {
		if(i%180==0) {
			System.out.print(i +" ");
		}
	}
	System.out.println("");
	System.out.print("while ile cozumu : ");
	
	while (sy<1000) {
		
		if(sy%180==0) {
			System.out.print(sy +" ");
		}
		sy++;
	}
	}

}
