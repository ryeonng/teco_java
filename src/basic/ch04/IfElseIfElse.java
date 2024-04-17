package basic.ch04;

public class IfElseIfElse {

	public static void main(String[] args) {

		int age = 3;
		
		if(age <= 3) { // if else if 사용 시, 조건의 범위가 아래로 갈수록 커져야 한다. age <= 3 : 제일 작은 범위
			System.out.println("학교에 아직 다니지 않습니다.");
		} else if(age <= 13) {
			System.out.println("초등학교에 다니고 있습니다.");
		} else if(age <= 16) {
			System.out.println("중학교에 다니고 있습니다.");
		} else {
			System.out.println("고등학교 이상 다니거나 졸업을 했습니다.");
		} // end of if 
		
		
		
	} // end of main

} // end of class
