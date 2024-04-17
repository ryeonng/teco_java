package basic.ch09;

public class Student {

	String name;
	int money; // 소지금
	
	// 생성자에 강제성 부여
	public Student(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}
	
	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까??
		bus.take(1500);
		money = money - 1500; //내가 가진 돈 -1500원
	}
	
	
	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		subway.take(1100);
		money = money - 1100; // 내 소지금 -1100원
	}
	
	// 상태창을 보여준다.
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 소지금 : " + money);
	}
	
	
}
