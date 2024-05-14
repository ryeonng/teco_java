package io.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {

		// 외부에 있는 파일 데이터를 읽으려면 input이 필요
		FileInputStream in = null;

		try {
			in = new FileInputStream("a.txt");

			// 1단계
			// int readData = in.read();

			// 2단계
			// System.out.println((char) in.read());
			// System.out.println((char) in.read());
			// System.out.println((char) in.read());

			// 3단계
			// 읽을 데이터가 더 이상 없다면, 기본적으로 -1 을 반환한다.
			int readData;
			while( ( readData = in.read()  ) != -1 ) {
				System.out.print((char)readData);
			}
			
			// 4단계 FileInputStream(기반 스트림) 대상에 접근해서 한 바이트 씩 읽어 들이는 기능
			// 1byte : 127 -128 (크기 공간) : a -> 97 , A -> 65, (한글) 대 (의 정수값은?) ->
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
