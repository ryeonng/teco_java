package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한 줄 입력하면 종료 됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가하라.
public class StandardInputExample2 {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.
		
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr); // 보조 스트림 (기반 스트림이 삽입 되어야 함)
				) {
			
			// isr -> 한 문자 씩 읽는 기능인 read() 를 가지고 있다.
			// br -> 한 번에 한 라인 씩 읽을 수 있는 기능을 가지고 있다.
			System.out.println("더 많은 텍스트를 입력 하세요. ( 한 줄 단위 ) -> 엔터 칠 때 까지");
			
			// isr.read(); -> 기능의 확장인
			String inputUserData = br.readLine();
			System.out.println("입력 확인 : " + inputUserData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
