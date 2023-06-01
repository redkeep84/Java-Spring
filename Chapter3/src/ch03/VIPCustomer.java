package ch03;

public class VIPCustomer extends Customer{

	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		// TODO VIP 할인율 적용 안됨. ch04에서 진행 예정(오버라이딩)
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	
	public String getAgentID() {
		return agentID;
	}
}
