package ch12_review;

public class TakeTexiTest {

	public static void main(String[] args) {
		
		Pasen pasenE = new Pasen("Edward", 20000);
		Taxi texiCompay = new Taxi("잘 간다 운수");
		pasenE.takeTaxi(texiCompay);
		
		pasenE.showPasenInfo();
		texiCompay.showTaxiInfo();
	}

}
