package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
//		tencoIntArray.insertElement(0, 50); // 0번째에 50을 넣음
//		tencoIntArray.insertElement(5, 50); // 테스트 이후에 수정하기 - todo 

//		System.out.println(tencoIntArray.getElement(0)); 

		tencoIntArray.printAll();

		System.out.println("-------------------------");

		System.out.println(tencoIntArray.getCountSize()); // 카운트 요소 갯수

		System.out.println("-------------------------");

		System.out.println(tencoIntArray.isEmpty()); // 요소가 하나라도 있음

		System.out.println("-------------------------");

		tencoIntArray.removeAll(); // 전체삭제
		tencoIntArray.printAll(); // 전체출력

	} // end of main

} // end of class
