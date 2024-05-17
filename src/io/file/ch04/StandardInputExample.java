package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한 줄 입력하면 종료 됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가하라.
public class StandardInputExample {

	public static void main(String[] args) {

		// 데이터를 통으로 관리하고 싶다면, -> 자료 구조 -> 적절한 자료 구조를 선택
		List<String> lines = new ArrayList<String>(); 
		
		System.out.println("여러 줄의 텍스트를 입력하세요.");
		System.out.println("입력을 종료 하려면 빈 줄에서 엔터를 누르세요.");
		// <-- 종료
		// 안녕 -> 엔터 치면 출력
		// "" -> 엔터 치면 종료 됨
		
		
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.
		
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {

			// while() {}
			String line;
			// "" -> 엔터 -> line.isEmpty() -- ! --> F --> 실행 종료 된다.
			while( ( line = br.readLine() ) != null && !line.isEmpty()) {
				lines.add(line);
				System.out.println("입력 확인 : " + line);
			}
			
			for(String data : lines) {
				System.out.println(data);
			}
			
			System.out.println("프로그램 종료 처리");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
