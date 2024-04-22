package basic.ch15;

import java.util.Scanner;

/**
 * author - 가료이 
 * 모든 프로그래밍의 기본은 C R U D 이다.
 */
public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터 UI 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물 처럼", "파울로 코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발 하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1"; // 상수 만듬
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		boolean flag = true; // 구간 반복

		while (flag) {
			System.out.println("** 메뉴 선택 **"); /// 반복되므로 while문 안으로.
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine(); // 문자열 받아줌 + 다음 줄로 이동 처리 해주는 메서드

			if (selectedNumber.equals(SAVE)) { // equals : 문자열 비교할 때
				System.out.println(">> 저장 하기 <<");
				save(sc, books);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(books);

			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByTitle(sc, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deletALL(books);

			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false; // 반복을 멈추는 깃발
			} else {
				System.out.println(">> 잘못된 선택 입니다. <<");

			}

		}

	} // end of main

	// * 함수를 활용 해보자
	// 전체 조회하기
	public static void readAll(Book[] books) { // 배열을 호출
		System.out.println("------전체 조회하기------");
		for (int i = 0; i < books.length; i++) {

			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}

	}

	// 전체 삭제하기
	public static void deletALL(Book[] books) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			// Object --> null
			books[i] = null; // 객체가 없으면 null을 넣으면 됨.
		}

	}

	// 저장하기 ( 하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("-----저장 하기-----");
		System.out.println("책의 제목을 입력 하세요.");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력 하세요.");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더 이상 책을 저장할 공간이 없습니다.");
			return;
		}

		// [0] <-- 에 값이 있다면 들어가지 x
		// [1] <--
		// [2] <--
		// [3] <-- null 이라면 new Book(bookTitle, bookAuthor)
		// [4] <-- null 이라면 new Book(bookTitle, bookAuthor)
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("책이 저장 되었습니다.");

	}

	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("-----선택 조회하기-----");
		System.out.println(">>> 책 제목을 입력해주세요. <<<");
		String bookTitle = sc.nextLine();
		boolean isFind = false;
		
		// 사용자가 입력한 책 제목
		// books (배열안에 있는 책 제목) 전부 조사 books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals
		// books[0].getTitle().equals() // 배열 안에 객체가 없다면 --> null point --> 방어적 코드 작성 해야함
		
		for(int i = 0; i < books.length; i++) {
			// 방어적 코드 작성 (null point 막기)
			if(books[i] != null) {
				if(books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true;
					break;
				}
			}
			
		}
		// 만약 선택된 값이 없다면
		// 해당 제목의 책은 존재하지 않습니다. 출력
		if(isFind == false) {
			System.out.println("해당 제목의 책은 존재하지 않습니다.");
		}
		
		
		// 만약 사용자가 입력한 책 제목과 배열 요소 안의 title값이 같다면
		// 화면에 책 제목과 저자 이름을 출력 하고,
		// 아니라면 
		// "해당하는 책이 없습니다." 문구를 출력 하시오.
		
		// * 심화 - 반복문을 전부 돌리면 안됩니다.
		
	}
	
	
	
	
} // end of class
