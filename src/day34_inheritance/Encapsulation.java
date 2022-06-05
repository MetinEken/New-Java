package day34_inheritance;

public class Encapsulation {

	private String okulIsmi= "yildiz koleji";
	private int okulHesapNo= 12345;
	private boolean okulAcikMi=true;
	
	public String getOkulIsmi() {
		
				return okulIsmi;
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMi() {
		return okulAcikMi;
	}
	
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
	}
	
	
	
}
