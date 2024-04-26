package useful;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2); // 주소값 다르므로 false 출력

		String str3 = "abc";
		String str4 = "abc"; // 불변

		// 상수 풀에 올라간 String 값은 (str3, str4)
		// 먼저 존재하는지 확인부터 한다.

		// 완전히 같은 문자열 abc가 존재한다면,
		// 새로 생성하지 않고 다시 재사용 한다.

		System.out.println(str3 == str4); // true

		// == 은 객체의 주소값을 비교하는 연산자 (참조 타입)
		// equals 는 문자열 값을 비교하는 아이
		// 결론적으로, 문자열의 비교는 논리적인 판단으로
		// 같은지와 다른지 true, false 값을 반환한다.
		
		System.out.println(str1 == str4); // false > 주소값을 비교
		System.out.println(str1.equals(str4)); // true > 문자열을 비교

	} // end of main

} // end of class
