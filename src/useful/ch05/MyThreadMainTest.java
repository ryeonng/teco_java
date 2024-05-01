package useful.ch05;

public class MyThreadMainTest {

	// 기본적으로 메인 작업자 하나를 가지고 있다. = 메인 쓰레드 라고 한다.
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		
		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread();
		th1.start(); // start가 호출되면 run() 메서드가 동작되도록 약속 되어 있다.
		System.out.println("--------------------");
		
		// 필요하다면, 추가 작업자를 더 만들수 있다.
		MyThread th2 = new MyThread();
		th2.start();
		
		// 메인쓰레드 + th1 + th2 : 3개의 쓰레드 존재 : 멀티 쓰레딩
		
	} // end of main

} // end of class
