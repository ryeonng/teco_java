package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {

		//Company company = new Company(); - 생성 불가
		
		// 고민! Company 객체에 어떻게 접근할 수 있을까?
		
		// A 클래스에서 활용
		Company company = Company.getInstance();
		System.out.println(company);
		
		// B 클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
	} // end of main

} // end of class
