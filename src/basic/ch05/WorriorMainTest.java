package basic.ch05;

public class WorriorMainTest {

	// 코드의 시작점(메인함수) --> JVM Stack 메모리 할당받음.
	public static void main(String[] args) {

		// new -> 예약어, () <- 생성자
		Worrior worrior1 = new Worrior();
		// 메모리에 올라가면, 객체라고 부른다.
		// 객체는 heap이라는 동적 메모리 영역에 올라간다.
		// 객체의 접근은 .연산자를 통해서 접근할 수 있다.
		
		Worrior worrior2 = new Worrior();
		
		worrior1.name = "티모";
		worrior1.health = 100;
		worrior1.attackPower = 30;
		worrior1.defensePower = 1;
		
		System.out.println("-------------------");
		
		worrior2.name ="야스오";
		worrior2.health =120;
		worrior2.attackPower =20;
		worrior2.defensePower =2;
		
		System.out.println("-------------------");
		System.out.println(worrior1.name);
		System.out.println(worrior2.name);
		
	}

}
