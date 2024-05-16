package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferdOutputStream {

	public static void main(String[] args) {

		// 현재 시간 (시작)
		long start = System.nanoTime(); // 더 정말한 현재 시간을 출력
		String data = "기반 스트림 + 보조 스트림을 활용해 보자.";

		// try - catch - resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			// 코드 수행 부분
			byte[] bytes = data.getBytes();
			// 보조 스트림 (Buffer)
			bos.write(bytes);

			// 간혹 버퍼에 데이터가 남아 있다면, 중복된 데이터를 사용할 수 있다.
			// 한 번 사용한 다음 flush 해야 한다.
			bos.flush(); // flush -> 물을 내리다.

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 얼마나 차이가 나는 지 시간을 측정하고 싶다.

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 현재 시간 (종료)
		long end = System.nanoTime();
		// 종료시간 - 시작시간 = 소요시간
		
		long duration = end - start;
		System.out.println(" 소요 시간 : " + duration);
		// 나노 초는 10억분의 1 -> 0.000287 초
		
	} // end of main

} // end of class
