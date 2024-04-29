package useful.ch03;

public class Password {

	private String pwd;

	// getter
	public String getPwd() {
		return pwd;
	}

	// setter
	public void setPwd(String pwd) throws PasswordException {

		if (pwd == null) {
			throw new PasswordException("비밀번호는 null 값일 수 없습니다.");
		}

		if (pwd.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}

		// matches로 정규 표현식을 활용할 수 있다.
		// pwd <== a~z , A~Z ==> true
		// pwd <== a, 10, ! ==> flase
		
		// true --> 예외를 발생시키는 코드
		// pwd --> abckde --> true --> 예외를 발생시키는 코드
		// pwd --> abck!@bb --> false --> 예외를 발생 안 시킴
		// 사용자한테 비밀번호 설정 시에 단 한 글자라도 특수문자를 포함시켜야
		// 예외 발생 하지 않게 코드를 작성한 것
		if (pwd.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}

		// [...] : 대괄호는 문자열을 나타낸다.
		// a-z, A-Z : 모든 알파벳 문자열을 말한다.
		// + : 바로 앞에 표현식이 하나 이상은 반복되어야 한다.
		// 즉, "Hello" 라고 쓰면, true를 반환한다.
		// "A1", "bbb"(3자 미만이므로) --> false 를 반환한다.
		this.pwd = pwd;

	}
}
