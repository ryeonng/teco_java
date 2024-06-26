package basic.ch03;

/**
 * 
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 사용 된다.
 * 연산의 결과는 true, false로 반환된다. 
 * 
 */

public class Operation6 {

	public static void main(String[] args) {

	    // 논리 연산자는 3가지 종류가 있다.
		// 논리곱 ---> && (엠퍼센트,엠퍼센트)
		// 논리합 ---> || (버티컬 바, 버티컬 바)
		// 부정 --> ! 
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리곱(&&)
		//                   T     &&      T
		// 논리곱은 전부 true 이면 true 반환한다. 하나라도 거짓이면 false를 반환한다.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag 1 : " + flag1);
		
		//       F           T     &&      F  
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		System.out.println("----------------------------");
		
		// 2. 논리 합
		//       T           T     ||     F
		// 둘 중에 하나라도 true 이면, 연산의 결과는 무조건 true 이다.
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag3);
		
		System.out.println("----------------------------");
		
		// 논리곱 : T T T T F --> false (하나라도 거짓이 있기 때문)
		// 논리합 : F F F T F --> true (하나라도 true가 있기 때문)
		
		//3. 부정
		System.out.println("부정 논리 연산자 사용 : " + !flag3); // 부정 ! 은 앞에 사용
		// 연산의 결과가 어떻게 되지? ---> 확인 해 봐야지 ---> 로깅을 한다.
		
		System.out.println("flag3 : " + flag3);
		
		
		
		
		
	} // end of main

} // end of class
