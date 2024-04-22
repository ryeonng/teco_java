package basic.ch14;

public class ArryTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26];
		
		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";
		
		System.out.println(arrayStr[4]); // -> null
		
		
		
		// 배열 안 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		// 반복문을 활용하라
		
		int eCount = 0;
		
		for(int i =0; i < arrayStr.length; i++) { // 반복문 26번 필요
			{if(arrayStr[i] != null) {
				// 요소의 개수 저장
				eCount++;
				System.out.println(arrayStr[i]);
			}
			
			}
		}
		
		System.out.println("배열 안 요소의 개수 : " + eCount);
	} // end of main

} // end of class
