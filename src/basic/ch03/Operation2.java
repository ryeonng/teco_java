package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		//int result4 = 5 / 3; // 정수 / 정수 = 정수로 형변환 // 고민 해 볼 사항
		double result4 = 5.0 / 3;
		int result5 = 5 % 3; // %는 나머지
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		
		int result6 = (12 + 3) / 3;
		System.out.println("result6 : " + result6);
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때, 나머지가 0이면 짝수, 1이면 홀수
		
		int result7 = 25 % 2;
		System.out.println("result7 : " + result7);
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		
		int result8 = 15 / 4;
		System.out.println("result8 : " + result8);
		int currentPosition = 0;
		final int ZERO_POINT = 0;
		
		currentPosition = ZERO_POINT- result8;
		System.out.println(currentPosition);
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 - 2문제 생성
		
	} // end of main

} // end of class
