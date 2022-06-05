package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 = new Encapsulation();
		
		obj1.isOkulAcikMi();
		
		obj1.setOkulIsmi("mehmet koleji"); // yeni bir atama yapmam gerekiyor
		System.out.println(obj1.getOkulIsmi());
		Encapsulation obj2 = new Encapsulation();
		
		obj2.setOkulIsmi("Ahmet koleji");
		System.out.println(obj2.getOkulIsmi());
		
	}

}
