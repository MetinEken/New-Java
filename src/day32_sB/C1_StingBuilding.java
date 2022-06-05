package day32_sB;

public class C1_StingBuilding {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Mehmet");
		System.out.println("sb1 : ");
		StringBuilder sb2 = new StringBuilder("Mehmet");
		System.out.println("sb2 : "+ sb2);
		System.out.println("esit mi : "+ sb2.equals(sb1)); // false
		
		// ancak kendisine esit=true verir
	}

}
