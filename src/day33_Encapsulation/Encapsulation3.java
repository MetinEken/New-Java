package day33_Encapsulation;

public class Encapsulation3 {
	
	

	public static void main(String[] args) {
		
		Encapsulation2 obj1 = new Encapsulation2();
	System.out.println(	obj1.sy); //123
	obj1.sy=456;
	System.out.println(	obj1.sy); //456 , cunku public
	System.out.println(obj1.getOkulIsmi()); // sadece gorebiliyorum, degistiremem
	
	Encapsulation2 obj2 = new Encapsulation2();
	System.out.println(	obj2.sy);  // 123, yeni obje ile ilk degerini aldi
	
	obj1.getOkulIsmi(); // sadece getirdi
	System.out.println(obj1.getOkulIsmi()); // getirdi ve yazdirdi sadece
	obj1.setTcNo("16883504645"); // mutlaka ilk degerini bizim girmemiz gerekiyor. set oldugu icin
	obj1.setTcNo("16883504644"); //degistirdik
	//System.out.println(obj1.tcNo); // gormeye izin yok. sadece st() oldugu icin
	  obj1.sy=789;
	  System.out.println(obj1.sy); // hem degistirdik, hem goruntuledik

	}

	

}
