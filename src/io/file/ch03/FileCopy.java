package io.file.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {

		// 스트림은 기본적으로 단방향 이다.
		// 입력 스트림, 출력 스트림 두 개가 필요하다.

		// 파일 경로 (복사 할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {

			
			int data;
			while ( (data = in.read( ) ) != -1) { 
				
				out.write(data);
			}
			
			
			System.out.println("입력 스트림 -> 출력 스트림 -> 입력 -> 출력 의 반복 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요 시간은 : " + duration);
		
		// 소요 시간을 초 단위로 변환 -> 포맷팅
		double seconds = duration / 1_000_000_000.0;
		// String 클래스에 format 메서드 사용 해보기
		String resultFormat = String.format("소요 시간은 : %.6f 초 입니다.",seconds);
		// % 는 포맷 지정자의 시작
		// f 지정자는 그 위치에 float이나 double 유형의 변수를 인자로 받아 처리 하겠다는 의미.
		System.out.println(resultFormat);

	} // end of main

} // end of class
