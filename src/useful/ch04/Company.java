package useful.ch04;

/**
 * 디자인 패턴 살펴보기 - 싱글톤 패턴은 무엇일까?
 *  규칙 세 가지 
 *  1. 생성자를 private 으로 만든다. 
 *  2. static 변수를 활용해서 내부에서 객체를 생성하고, 주소값을 할당한다. 
 *  3. 외부에서 유일하게 참조할 수 있는 public 메서드를 제공한다.
 */
public class Company {

	// 2. static 변수를 활용해 데이터 타입을 선언만 함
	private static Company company;

	// 1. 생성자의 접근 제어 지시자를 public -> private 변경하면,
	// 외부에서 기본 생성자를 호출할 수 없다.
	private Company() {}

	// 3. 외부에서 접근 가능한 메서드를 만들어 준다.
	public static Company getInstance() {
		
		if (company == null) {
			company = new Company();
		}
		
		return company; // 리턴은 자기자신
	}
	
}
