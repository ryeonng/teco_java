package useful;

public class StringTest2 {

	public static void main(String[] args) {

		String str3 = "abc";
		System.out.println( System.identityHashCode(str3)); // str3의 주소값을 출력하는 법
		
		String str4 = "abc"; 
		System.out.println( System.identityHashCode(str4)); //System.identityHashCode 사용
		
		// 여기까지는 위치가 어디든 주소 똑같음!
		
		str3 = str3 + " : def";
		System.out.println( System.identityHashCode(str3)); // > 주소가 다르게 새로 생성 됨.
		// 리터럴 타입으로 생성한 String 타입은 한번 생성하면 불변이다.

	} // end of main

} // end of class
