package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {

		// * 다형성
		// 다양한 형태로 클래스 ( 데이터 타입 ) 를 바라볼 수 있다.

		Fruit fruit1 = new Banana(); // 업캐스팅 된 상태
		Fruit fruit2 = new Peach(); // 업캐스팅 된 상태
		// 업캐스팅 : 부모의 데이터 타입으로 자식의 주소값 할당

		fruit1.showInfo();
		fruit2.showInfo();

		System.out.println("-------------------------");

		// 다형성을 사용하면 코드를 유연하게 작성할 수 있다.

		Banana banana1 = new Banana(); // 업캐스팅 된 상태
		Peach peach1 = new Peach(); // 업캐스팅 된 상태
		Peach peach2 = new Peach(); // 업캐스팅 된 상태

		Fruit[] fruits = new Fruit[3]; // 과일의 배열타입
		fruits[0] = banana1; // fruit1
		fruits[1] = peach1; // fruit2
		fruits[2] = peach2;

		System.out.println("-------------------------");
		// fruits[0] --> 바나나
		// 바나나의 속성인 origin을 출력하시오
		// 바나나의 기능인 saleBanana() 메서드를 호출하시오

		// Banana bananaCasting = (Banana)fruits[0];
		// bananaCasting.origin
		System.out.println(((Banana) fruits[0]).origin);
		((Banana) fruits[0]).saleBanana(); // 다운캐스팅

		System.out.println("-------------------------");

		// 배열은 반복문과 함께 많이 사용된다.

		// 0 --> 바나나 객체
		// 1 --> 복숭아 객체

		// ClassCastException : 형변환시 예외발생 오류

		// * instanceof 연산자를 알아야 해결 가능
		// 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for (int i = 0; i < fruits.length; i++) { // if문 횟수 : 3번 돌아감
			// 방어적 코드 (instanceof연산자)
			if (fruits[i] instanceof Banana) {
				((Banana) fruits[i]).saleBanana();
			} else {
				fruits[i].showInfo();
			}
		}
	} // end of main

} // end of class
