package basic.ch23;

public class Father extends Thread {
	
	// BankAccount account = new BankAccount();
	BankAccount account; // 메모리 공간 선언
	
	public Father(BankAccount account) {
		// 객체가 될 때 맨 처음 동작하는 코드는 생성자이다.
		this.account = account;
	}
	
	// 위임 시킬 일을 정의 할 예정
	@Override
	public void run() {
		// 1만원 입금 처리 - 다른 작업자에게 위임
		account.saveMoney(10_000);
	}

}
