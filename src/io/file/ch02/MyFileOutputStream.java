package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	// 코드의 시작점
	public static void main(String[] args) {

		long start = System.nanoTime();
		
		// 데이터가 존재
		String data = "Hello, Java FileOutputStream \n안녕 반가워";

		// 1. 파일에다 데이터를 저장하고 싶다면, (바이트 기반)
		// 자바 8버전부터 제공
		// try - catch - resource -> (자동으로 자원을 닫아준다.)

		try (FileOutputStream fos = new FileOutputStream("output.txt", false) // 데이터를 계속 붙일 거라면, true로 선언

		) {
			// data(String) 가지고 있는 문자열들을 byte 배열로 반환 처리
			// byte[] bytes = data.getBytes();
			byte[] bytes = { 72, 101, 108, 108, 111 }; // Hello
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}

			// 연결 된 스트림을 활용해서 byte 배열을 파일에다 흘려 보냄
			fos.write(bytes);

			System.out.println("파일 출력 스트림을 통해서 데이터를 씀");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 동작 이해 해보기
		// 파일에 byte 단위로 데이터를 쓰고
		// 그 파일을 열었을 때, 글자로 보이는 이유는 파일을 읽는 프로그램
		// 파일 내 byte 데이터를 문자로 해석해서 (문자 인코딩) 보여 주었다.
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("기반 스트림 파일 입출력 소요 시간: " + duration);
		
	} // end of main

} // end of class
