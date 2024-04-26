package useful;

public class StringBufferTest {

	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("World");
		
		StringBuffer bufferStr = new StringBuffer("Hello"); // StringBuffer 라는 데이터 타입
		System.out.println(bufferStr);
		// 1. 
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소값 출력
		
		bufferStr.append(str2); // = bufferStr.append("World");
		
		System.out.println(bufferStr);
		// 2.
		System.out.println(System.identityHashCode(bufferStr));
		
		// 1번 결과와 2번 결과의 주소값이 똑같다는 의미는
		// 새로운 메모리를 할당한 것이 아니라 변경한 것이다.
		
		// 활용
		String newStr = bufferStr.toString(); // toString 호출 시 String 타입이 됨.
		
		
	} // end of main
	
} // end of class
