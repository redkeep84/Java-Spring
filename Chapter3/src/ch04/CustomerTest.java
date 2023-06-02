package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.bonusPoint = 1000;
//		int price = customerLee.calcPrice(1000);
//		System.out.println(customerLee.showCustomerInfo() + price);
//		
//		
//		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//		customerKim.bonusPoint = 10000;
//		price = customerKim.calcPrice(1000);
//		System.out.println(customerKim.showCustomerInfo() + price);
//		
//		Customer vc = new VIPCustomer(12345, "nonname");
////		vc.calcPrice(1000);
//		System.out.println(vc.calcPrice(1000));
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		int priceNo = customerNo.calcPrice(10000);
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + priceNo + "원 입니다.");
	}

}
