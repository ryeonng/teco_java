package io;

import java.io.IOException;

public class MySystemIn {

	public static void main(String[] args) {

		// 키보드로 입력한 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요.");
		
		// 바이트 동작 --> 0과 1로 구성
		// 정수 --> byte, short, int, long
		
		int i;
		// 한 바이트 씩 키보드의 값을 읽는다.
		
		try {
			i = System.in.read();
			System.out.println("--------------------------");
			
			// 출력
			System.out.println(" i : " + i);
			
			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용 (인코딩)
			System.out.println(  (char) i); // i라는 값을 형변환
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // end of main

} // end of class
