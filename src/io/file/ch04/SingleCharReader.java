package io.file.ch04;

import java.io.InputStreamReader;

public class SingleCharReader {

	public static void main(String[] args) {

		// 문자 기반의 InputStreamReader 사용 방법
		// ★★★★★ 중요 ★★★★★
		// InputStreamReader 는 한 바이트 씩 데이터를 읽는 것이 아니라,
		// 하나의 문자 단위로 읽는다 !!!

		System.out.println("문자 하나를 입력 하세요.");

		// try - catch - resource
		try (InputStreamReader isr = new InputStreamReader(System.in)) {

			// 한글 <- 통으로 읽음 -> InputStreamReader
			// 한글 <- 한 바이트로는 못 읽음 -> InputStream
			
		int charData = isr.read(); // 사용자가 키보드에 값을 입력할 때 까지 대기한다.
		// 방어적 코드
		if(charData != -1) {
			// -1 은 파일의 끝을 나타낸다. ( = EOF, End Of File )
			// EOF 가 아니라면, 출력하라는 코드.
			System.out.println("사용자가 입력한 값 : " + (char)charData); 
			// char -> 2 byte 크기 ! (한글은 2byte로, 거의 모든 글자의 표현이 가능하다.)
		}
		
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	} // end of main

} // end of class
