package day42_Abstractclasses;

public abstract class Abstractclass {
	
	//tum class larda olmasini istedigimiz variable ve methodlar abstract class da olusturulur
	// abstract methodlarin method lari yoktur., boylece diger class lardan overriding yapilmalidir. ZORUNDADIR
	// body olmadigi icin method icini degistirecegiz normal olaarak
	// abstract olmayan class lara concrete class denir. somut class. abstract= soyut, oz
	// TUM CONCRETE CLASS LAR ABST.. DAKI METHODLARI OVERRID YAPMAK ZORUNDA
	// class ismine abstract yazmaliyiz
	
	public abstract int deneme();
	public void de() {
		// bu method abstract degildir, java itiraz etmiyor
	}
}
