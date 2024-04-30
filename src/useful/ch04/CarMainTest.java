package useful.ch04;

public class CarMainTest {

	public static void main(String[] args) {

		Car aiCar = new AICar(); // 다형성 적용, 업캐스팅된 상태.
		// 프로그램을 실행 시키기 위해 run() 메서드를 호출해야 한다는 약속을 했다면,
		aiCar.run();
		
		System.out.println("-------------------------------");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
	} // end of main

} // end of class
