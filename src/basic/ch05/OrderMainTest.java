package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		Order orderBox1 = new Order();
		
		System.out.println(orderBox1);
		
		orderBox1.menu ="햄버거";
		orderBox1.address ="그린컴퓨터아카데미";
		orderBox1.number =1234;
		
		System.out.println(orderBox1.menu);
		System.out.println(orderBox1.address);
		System.out.println(orderBox1.number);
	}

}
