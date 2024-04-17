package basic.ch07;

public class Order {

	int orderID;
	String orderName;
	String orderProduct;

	public void order() {
		System.out.println(orderName + "주문자가 주문을 합니다.");
	}
	public void productCancle() {
		System.out.println(  "주문자의 아이디는 " +orderID + "입니다.");
		
	}
}
