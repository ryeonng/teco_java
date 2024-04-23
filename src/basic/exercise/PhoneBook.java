package basic.exercise;

public class PhoneBook {


	private String userName;
	private String phNumber;

	// 생성자
	public PhoneBook(String name, String number) {
		this.userName = name;
		this.phNumber = number;
	}


//	// getter 메서드
//	public int getTotalPage() {
//		return totalPage;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getNumber() {
//		return number;
//	}
//	

	

	public void showInfo() {
		System.out.println(">>> 전화번호부 정보 <<<");
		System.out.println("이름 : " + userName);
		System.out.println("번호 : " + phNumber);
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

}
