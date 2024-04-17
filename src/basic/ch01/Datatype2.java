package basic.ch01;

/**
 * 문자 데이터 타입
 * char 자료형의 크기는 2byte 입니다.
 */
public class Datatype2 {

	
	public static void main(String[] args) {

		// 기본 자료형 중 - 문자 타입(사실은 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용.
		// char 타입은 단, 하나의 문자만을 저장할 수 있다.
		
		char charBox;
		charBox = 'B'; // char 는 홑따옴표를 사용한다. 
		System.out.println(charBox);
		
		// charBox = '가나'; // 대입 불가 - 두 글자
		// 참고 ! 두 개 이상의 문자가 연속된 형태를(String) 문자열 --> "안녕반가워"
		
		System.out.println("---------------------------");
		System.out.println((int)charBox);
		
		// 도전 문제
		// 소문자 a, b, c 는 정수값으로 얼마 일까?
		charBox = 'a';
		System.out.println((int)charBox);		
		charBox = 'b';
		System.out.println((int)charBox);
		charBox = 'c';
		System.out.println((int)charBox);
		
	} // end of main

} // end of class
