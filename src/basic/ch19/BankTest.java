package basic.ch19;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank("그린은행"); // 독립적인 생명 주기를 가진다.
		Customer customer = new Customer("홍길동"); // 독립적인 생명 주기를 가진다.
		
		// 연관 관계라고 한다.
		customer. useBankService(bank);
		
		// enum type 연습
		bank.provideService(ServiceType.ACOUNT_INFO, customer);
		
	}

}
