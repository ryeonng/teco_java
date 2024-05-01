package useful.ch05;
/**
 * 쓰레드를 추가하는 방법 - 상속을 활용할 수 있다.
 * Thread --> Runnable --> run()
 */
public class MyThread extends Thread { // 다형성 적용 : MyThread -> Thread 로 볼 수 있다.
	
	
	// 우리가 정의한 클래스에서 run() 메서드를 오버라이드 사용해 재정의할 수 있다.
	// 쓰레드를 사용할 때 알아야 하는 필수 개념 ! (※암기하자)
	// 쓰레드가 가지고 있는 메서드인 start()를 호출하면,
	// 약속으로 run() 메서드가 호출되어 동작하도록 만들어져 있다.
	@Override
	public void run() {
		// 우리가 동작 시키고자 하는 일을 정의해서 코드를 설계할 수 있다.
		// 임무 -> 반복문 200 번을 수행하라.
		for (int i = 0; i < 200; i++) {
			System.out.println(i + ", "); // 줄 바꾸지 않고 옆으로 프린트 하라.
			try {
				Thread.sleep(500); // 500 = 0.5초 // 1000 = 1초 : 쉬었다가 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

} // end of class
