package ch06;

public class Order {

	public int FoodID = 0003;
	public int orderId;
	public int orderPhon;
	public String orderAddress;
	public int orderDate;
	public int orderTime;
	public int productPrice;
	public int productId;
	
	public Order() {}
	
	public Order(int FoodID, int orderID, int orderPhon, String orderAddress, int orderDate, int orderTime, int orderPrice, int productId) {
		this.orderId = orderID + FoodID;
		this.orderPhon = orderPhon;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.productPrice = orderPrice;
		this.productId = productId;
	}
	
	public String showOrder() {
		return (
				"주문 접수 번호: " + orderId + "\n" + 
				"주문 핸드폰 번호: " + orderPhon + "\n" +
				"주문 집 주소: " + orderAddress + "\n" +
				"주문 날짜: " + orderDate + "\n" +
				"주문 시간: " + orderTime + "\n" +
				"주문 가격: " + productPrice + "\n" +
				"메뉴 번호: " + productId
				);
	}
	
}
