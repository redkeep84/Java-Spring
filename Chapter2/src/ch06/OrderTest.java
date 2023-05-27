package ch06;

public class OrderTest {

	public static void main(String[] args) {
		
		Order deliveryOrder = new Order();
		
		deliveryOrder.orderId = 20201102;
		deliveryOrder.orderPhon = 01023450001;
		deliveryOrder.orderAddress = "서울시 강남구 역삼동 111-333";
		deliveryOrder.orderDate = 20201102;
		deliveryOrder.orderTime = 130258;
		deliveryOrder.productPrice = 35000;
		deliveryOrder.productId = 0003;
		
		System.out.println(deliveryOrder.showOrder());
	}

}
