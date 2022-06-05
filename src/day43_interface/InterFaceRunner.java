package day43_interface;

public class InterFaceRunner implements Interface1  {

	public static void main(String[] args) {
		
		
		Interface1.deneme2();  //static oldugu icin calisti
							  // default method ise obje uzzerrinden cagirilabilir
					   //	 //
				      //\\	//
				     //  \\//

		InterFaceRunner obj =new InterFaceRunner();
		obj.deneme();
	}

}
