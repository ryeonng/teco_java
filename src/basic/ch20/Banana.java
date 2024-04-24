package basic.ch20;

public class Banana extends Fruit {
// Fruit라는 데이터타입으로 볼 수 있다.

	String origin;

	public Banana() {
		name = "춘식이바나나";
		price = 5000;
		origin = "한국";
	}
	
	public void saleBanana() {
		System.out.println("바나나 가격을 할인합니다.");
		price -= 1000; 
	}
	
	
	
}
