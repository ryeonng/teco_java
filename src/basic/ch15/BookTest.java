package basic.ch15;

public class BookTest {

	public static void main(String[] args) {

		// * 배열이란 - 연관된 데이터를 하나의 변수의 통으로 관리하고 싶다면 - 자료구조
		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book[] books = new Book[10]; // 배열에 메모리 공간 선언
		// 맨 앞의 Book > Book이라는 데이터 타입을 담는 공간
		
		books[0] = new Book("플러터 UI 실전" , "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다" , "김진명");
		books[2] = new Book("흐르는 강물 처럼" , "파울로 코엘료");
		books[3] = new Book("리딩으로 리드하라" , "이지성");
		books[4] = new Book("사피엔스" , "유발 하라리");
		books[9] = new Book("홍길동전" , "허균"); // 마지막 인덱스 (인덱스 크기 : 9)
		
		// 배열은 반복문과 함께 많이 활용된다.
		// 배열의 크기와 요소의 크기는 꼭 동일한 것은 아니다.
		
		//books[3] --> Book 이란 객체로 바라봄	
		//System.out.println(books[3].getTitle());
		//System.out.println(books[3].getAuthor());
		//반복적인 패턴이 보인다. > 반복문 활용해보자
		
		//System.out.println(books[5].getTitle()); 오류발생 (객체 없기 때문, NullPointException)
		
		for(int i = 0; i < books.length; i++) {
			// books[0]. --> 객체 존재 . 활용해 확인 가능
			// books [5]. --> 5번 객체 존재 x , 가르키는 주소가 없다.
			
			// 방어적 코드를 작성해 주어야 한다. > 9번 홍길동전까지 잘 출력되게 됨!
			if(books[i] != null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("--------------------------");
			}
		}
		
		
		
	} // end of main

} // end of class
