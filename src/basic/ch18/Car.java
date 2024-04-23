package basic.ch18;

public class Car {
// 자동차와 엔진은 상속 관계 절대로 XXXX 포함관계임
	
	String name;
	int price;
	Engine engine; // Composition (포함관계)
	
	public Car() {
		// 포함관계 - Composition
		// 객체 안에 필요 객체를 직접 생성할 경우
		// Composition 관계라고 한다.
		engine = new Engine(); // Car 라는 객체가 생성이 될 때 Engine 객체도 함께 생성 된다.
		
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발 합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
	
}
