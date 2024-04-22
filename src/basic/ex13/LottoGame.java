package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 = 클래스 변수
		int gameNumber1 = LottoNumberMaker.makeNumber(); 
		int gameNumber2 = LottoNumberMaker.makeNumber(); 
//		int gameNumber3 = LottoNumberMaker.makeNumber(); 
//		int gameNumber4 = LottoNumberMaker.makeNumber(); 
//		int gameNumber5 = LottoNumberMaker.makeNumber(); 
//		int gameNumber6 = LottoNumberMaker.makeNumber(); 
		//                    클래스이름  . 변수
		
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
//		System.out.println(gameNumber3 + "\t");
//		System.out.println(gameNumber4 + "\t");
//		System.out.println(gameNumber5 + "\t");
//		System.out.println(gameNumber6 + "\t");
//		
		// 오름차순으로 정렬해보기
		// 만약 상자1이 상자2 보다 크다면, 어떤 행동을 하라!
		// 단, 변수에 값을 담고 출력 하세요.
		
		// 예상 box1 = 5 , box2 = 3
		int tempBox = 0;
		if(gameNumber1 > gameNumber2) {
			// 0    =    3  --> temp == 3 
			// 0    =    5  --> temp == 5
			tempBox = gameNumber2;
			//  3 
			gameNumber1 = gameNumber2;
			//  3
			gameNumber2 = tempBox;
		}
		System.out.println();
		System.out.println("-----------------------");
		// 정렬 --> 3 , 5
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		
	} // end of main

} // end of class
