package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩이란?
	//    → 생성자의 개수가 여러 개 있다.
	
	// 기본 생성자 형태 만들어 보기
	public UserInfo() {	}
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}
	

	// 연습문제
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String name, String pw) {
		userId = id;
		userName = name;
		userPassword = pw;
	}
	// 2 - 매개변수 4개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String name, String pw, String add) {
		userId = id;
		userName = name;
		userPassword = pw;
		userAddress = add;
	}
	// 3 - 매개변수 5개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id, String name, String pw, String add, String phone) {
		userId = id;
		userName = name;
		userPassword = pw;
		userAddress = add;
		phoneNumber = phone;
	}
	
	
	
} // end of class
