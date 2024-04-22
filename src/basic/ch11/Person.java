package basic.ch11;

public class Person {

	// this의 3가지 사용방법
	// 1. this 는 자기 자신을 가리킨다. (인스턴스의 주소이다)
	// 2. 생성자에 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값 or 주소값)를 반환 시킬 수 있다.
	
	// 변수 세팅 --> 기본 값을 private로 
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	// 1.
	// 생성자 만들기
	// 생성자를 여러개 > 생성자 오버로딩
	public Person(String name, int age) {
		// 자기 자신의 멤버 변수 name(왼)에 외부에서 들어 오는 지역 변수 name(오)을 대입
		this.name = name; 
		this.age = age;
	}
	
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출 할 수 있다. this(...)
		//this.name = name;
		//this.age = age;
		this(name, age); // 다른 생성자를 가장 먼저 호출하고, 다른 수식을 작성해야 함!(phone먼저xx)
		this.phone = phone;
	}
	
	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}
	
	// 3. 자신의 주소값을 반환 시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환 시킨다.
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// getter
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getGender() {
		return gender;
	}
	
	
}
