package io;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {

		// 키보드로 입력한 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요.");
		
		// 바이트 동작 --> 0과 1로 구성
		// 정수 --> byte, short, int, long
		
		int i;
		// 한 바이트 씩 키보드의 값을 읽는다.
		
		try {
			while( ( i = System.in.read() ) != '\n' ) {
				System.out.println(" i : " + i);
				System.out.println("(char)i : " + (char)i); // 인코딩 처리
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // end of main

} // end of class
