package basic.ch21;
// Animal이 추상 클래스 --> 물려 받으려면 Human도 추상 클래스로.
// 추상 클래스를 상속한 경우
// 2가지 해결 방법
// 1. 자식 클래스를 추상 클래스로 만들어 버린다.
// 2. 추상 메서드를 오버라이드해서 구현 메서드로 재정의 한다.
public class Human extends Animal {

	// 재정의 -- 일반 메서드로 재정의
	@Override
	public void hunt() {
		System.out.println("권총으로 사냥을 합니다");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 움직입니다");
	}

	
	
}
