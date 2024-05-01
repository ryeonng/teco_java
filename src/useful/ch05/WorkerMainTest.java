package useful.ch05;

public class WorkerMainTest {

	// 메인 작업자
	public static void main(String[] args) {
		System.out.println("------------------ main 쓰레드 시작 ------------------");
		System.out.println(Thread.currentThread()); //현재쓰레드 작성
		
		// 작업자 하나 만들어 내기
		Worker worker1 = new Worker("워커1"); // 하위쓰레드(워커1)의 생성은 메인쓰레드가 했다.
		// 명령어를 통해 워커1에게 네가 위임 받은 일을 시작하라 명령.
		worker1.start(); // 메인 쓰레드가 내린 명령어
		
		System.out.println("------------------- main 쓰레드 종료 ------------------");
	}

}
