package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {

		//BreakTest1 자바 파일을 보고 BreakTest2 자바 파일을 만들고
		//for 문 대신 while 구문을 활용해서 코드를 작성해 보세요
		// 소수 7이면 반복문을 멈추어라
		int i = 1;
		while(i < 11) {
			// 단독 if 구문은 수행이 될 수도 있고 안될 수도 있다.
			if (i % 7 == 0) {
				// 중간에 멈추어라 --> break
				break;				
			}
			System.out.println("i의 값 : " + i );
		
			 i++;
		} // end of while
		
		
	} // end of main
	
} // end of class
