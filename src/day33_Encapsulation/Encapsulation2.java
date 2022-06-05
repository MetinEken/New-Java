package day33_Encapsulation;

public class Encapsulation2 {
	
	@SuppressWarnings("unused")
	private String tcNo = "12345678901";
	@SuppressWarnings("unused")
	private int hesapNo =123456;
	private String okulIsmi ="Yildi koleji";

	@SuppressWarnings("unused")
	private int hesap=1234578;
	
	public int sy=123;
	public static void main(String[] args) {
		
		System.out.println();
		
//denemeMethod();
	}
	
	@SuppressWarnings("unused")
	private void denemeMethod() {
		System.out.println("deneme method u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

	

}
