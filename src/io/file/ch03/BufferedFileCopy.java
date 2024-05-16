package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// ( byte 기반 스트림을 활용 )
		// 기반 스트림 + 보조 스트림을 활용해
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오.

		// 현재 시간
		long start = System.nanoTime();

		// 복사 할 대상
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\0412.zip";
		// 목적지 파일
		String destinationFilePath = "copy2.zip";

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				BufferedInputStream bin = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedOutputStream bout = new BufferedOutputStream(out);) {
			int data;
			while ((data = bin.read()) != -1) {
				bout.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		long duration = endTime - start;
		System.out.println("소요시간 출력 : " + duration);
		double seconds = duration / 1_000_000_000.0;
		String resultFormat = String.format("소요 시간은 : %.6f 초 입니다.",seconds);
		System.out.println(resultFormat);
	}

}
