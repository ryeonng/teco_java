package basic.ch07;

public class User {

	String id;
	String passward;
	String name;
	String gender;
	int age;
	
	// 패스워드 체크 기능 만들어 보기
	// 동사로 시작하는 것이 권장 사항이다.
	public boolean checkPassward(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가 있는
		// passward값과 외부에서 넣을 inputPwd값이 
		// 같다면 true를 반환, 아니면 false를 반환하라.
		// == 은 주소값, 산술식에 사용한다.
		// 문자열 비교는 equals 라는 메서드를 사용한다.
		if(passward.equals(inputPwd)) {
			return true;			
		}
		return false;
	}
	
	// 독립적인 함수로서 여기서 실행 시킬 수 있다.
	public static void main(String[] args) {
		// User 클래스를 인스턴스화 시켜 주세요.
		User user1 = new User(); // 메모리에 올라간다. (heap)
		user1.passward = "123";
		
		User user2 = new User();
		user2.passward = "555";
		
		System.out.println("-----------------------");
		
		// user1 pwd를 확인하고 싶다.
		// 1
		boolean user1Result = user1.checkPassward("333");
		System.out.println("user1 : " + user1Result);
		// 2
		boolean user1Result2 = user1.checkPassward("123");
		System.out.println("user1 두번째 결과 : " + user1Result2);
		
		System.out.println("------------------------------");
		// 참조 변수 user2 기능인 checkPassward 호출해서 결과를 확인 해주세요.
		// --F
		// --T
		
		// 실행에 흐름 만드는 방법 연습입니다. - 3
		// if 구문을 활용해서
		// 콘솔창에 비밀번호가 틀렸습니다. 출력
		// 콘솔창에 비밀번호가 맞아요. 출력
	}
	
} // end of class
