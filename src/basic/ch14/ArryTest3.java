package basic.ch14;

public class ArryTest3 {

	public static void main(String[] args) {

		char[] alpahbets = new char[26]; // 인덱스의 크기 : 25
		char ch1 = 'A'; 
		alpahbets[0] = ch1;
		
		char ch2 = 'B';
		alpahbets[1] = ch2;
		
		char ch3 = 'C';
		alpahbets[2] = ch3;
		
		char ch26 = 'Z';
		alpahbets[25]= ch26;
		
		System.out.println("------------");
		System.out.println(alpahbets[3]);
		if(alpahbets[3] == 0 ) { // char 는 값이 없으면 0으로 들어가 있다.
			System.out.println("동작함");
		}
		System.out.println("------------");
		
		// 배열은 반복문과 함께 많이 사용된다.
		int forCount = 0;
		int eCount = 0;
		
		for(int i = 0; i < alpahbets.length; i++) { //배열의 길이 헷갈리므로 length변수 사용
			if(alpahbets[i] !=0) {
				eCount++; //만약 0이 아니라면 eCount를 1씩 올려라!
			}
			//alpahbets[i];
			System.out.println(alpahbets[i]);
			forCount++;
		} // 반복문 안에서 26번 돌면서, 0이 아닌 아이들의 값을 계산한다면? 
		
		System.out.println("for 동작 횟수 : " + forCount);
		System.out.println("배열 안 요소의 개수 : " + eCount);
		
	} // end of main

} // end of class
