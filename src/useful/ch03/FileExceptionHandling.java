package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	// 메인 쓰레드
	public static void main(String[] args) {

		FileInputStream fis = null;
		
//		fis = new FileInputStream("test1.txt"); // FileNotFoundException : txt파일이 없을 수 있다. F2 예외처리 
		try {
			fis = new FileInputStream("demo.txt");
			//return; // catch구문은 실행 x finally구문만 실행
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행");
			e.printStackTrace(); 
		} finally {
			// 반드시 수행 되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 수행이 된다.
			System.out.println("finally 블록 수행");
			
//			fis.close(); // 닫는 시점에 fis. <- 객체가 생성이 안되었을 경우도 존재 함.F2 예외처리
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("비정상 - 종료 되지 않았습니다.");
		
	} // end of main

} // end of class
