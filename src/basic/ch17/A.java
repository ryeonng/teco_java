package basic.ch17;

// 상상력 추가
// A 클래스는 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;
	
	// 코드를 바로 수정한다면...
}
// 단, 하나의 자바 파일 안에 여러 개의 클래스를 작성할 수 있다.
// 단, public 클래스는 오직 하나만 정의 가능하다.
// 복사 + 붙여넣기도 가능하다.
 class B { 

	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName; // 가져 온 코드에 추가적인 코드 생성
}
 
 // 상속이라는 문법을 배운 개발자라면...
 
 class C extends A { // A 라는 클래스를 상속하겠다는 뜻. ⓒ → ⓐ ( c가 자식, a가 부모)
	 
	 int level;
	 String nickName;
	 String phone;
	 
	 
 }