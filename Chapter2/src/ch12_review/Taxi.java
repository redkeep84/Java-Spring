package ch12_review;

public class Taxi {

	String taxiCompanyName;
	int passengerCount;
	int money;
	
	public Taxi(String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void take(int money) {
		this.money += money;
//		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompanyName + " 수입은 " + money + "원 입니다.");
	}
}
