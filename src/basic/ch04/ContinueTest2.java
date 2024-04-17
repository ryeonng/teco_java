package basic.ch04;

public class ContinueTest2 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {

		// ContinueTest1 자바 파일을 보고 ContinueTest2 자바 파일을 만들고
		// for 문 대신 while 구문을 활용해서 코드를 작성해 보세요
		int i = 1;
		
		// 풀이 2 : 특정 조건이 되었을 때, 반복문을 멈추어라
		boolean flag = true;
		while(flag) {
			if(i % 3 == 0) {
				System.out.println("3의 배수 : " + i );
				
			}
			
			// 특정 조건 --> 멈추기
			if(i == 100) {
				flag = false; // i == 100
			}
				
			i++;	// i == 101
		}
		
		
		// 풀이 1
//		while (i < 101) {
//			if (i % 3 == 0) {
//				System.out.println("i의 값 : " + i);
//			}
//
//			i++; // 식 사용하기 (무한 반복 예방)

		//} // end of while
		
		

	} // end of main

} // end of class
