package ch12_review;

public class Pasen {

	String pasenName;
	int money;
	
	public Pasen(String pasenName, int money) {
		this.pasenName = pasenName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showPasenInfo() {
		System.out.println(pasenName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
