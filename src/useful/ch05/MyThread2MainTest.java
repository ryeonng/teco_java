package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {

		System.out.println(" main start ");

		// * 문제
		// MyThread2를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출하라.
		// 힌트 ) Thread 문서를 반드시 확인하라.


		MyThread2 mythread2 = new MyThread2();
		//myThread2.run(); 는 일반 메서드를 호출하는 것 뿐임!!!
		
		// 새로운 작업자를 생성해서 위임 시킬때는, Thread 안에 있는  ★ start() ★ 메서드를 호출해야 한다.
		// ※ 암기 ! 
		
		Thread thread1 = new Thread(mythread2); // mythread2 : runnable 데이터 타입 -> runnable 데이터 타입을 호출함.
		thread1.start();
		
		// 결국 다른 작업자에게 일을 위임하려면, 쓰레드에 start()를 호출해야 한다.

		System.out.println("----------- end main thread -----------");

	} // end of main

}
