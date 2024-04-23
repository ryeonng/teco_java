package basic.exercise;

import java.util.Scanner;

import basic.ch15.Book;

public class PhoneBookManager {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {
		// 스캐너 사용
		// 배열 선언 100개
		// while()

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phbooks = new PhoneBook[100];

		phbooks[0] = new PhoneBook("가료이", "0101");
		phbooks[1] = new PhoneBook("또아", "0102");
		phbooks[2] = new PhoneBook("짱구", "0103");
		phbooks[3] = new PhoneBook("유리", "0104");
		phbooks[4] = new PhoneBook("훈이", "0105");

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH = "3";
		final String CHANGE = "4";
		final String DELETE = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.조회 3.선택 조회 4.수정 5.삭제");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				save(sc, phbooks);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 번호 조회 하기 <<");
				searchAll(sc,phbooks);

			} else if (selectedNumber.equals(SEARCH)) {
				System.out.println(">> 선택 조회 하기 <<");
				searchByName(sc, phbooks);

			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">> 삭제 하기 <<");
				delete(sc,phbooks);

			} else if (selectedNumber.equals(CHANGE)) {
				System.out.println(">> 연락처 수정하기 <<");
				update(sc, phbooks);

			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택 입니다. <<");

			}

		}

		for (int i = 0; i < phbooks.length; i++) {

			if (phbooks[i] != null) {
				System.out.println(phbooks[i].getUserName());
				System.out.println(phbooks[i].getPhNumber());
				System.out.println("--------------------------");
			}
		}

	} // end of main

	// 저장
	public static void save(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----저장 하기-----");
		System.out.println("저장할 이름을 입력 하세요.");
		String userName = sc.nextLine();
		System.out.println("저장할 번호를 입력 하세요.");
		String phNumber = sc.nextLine();
		PhoneBook phbook = new PhoneBook(userName, phNumber);

		
		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks[i] == null) {
				phbooks[i] = phbook;
				break;
			}
		}
		System.out.println("전화번호가 저장 되었습니다.");

	}

	// 조회
	public static void searchAll(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("------번호 조회하기------");
		for (int i = 0; i < phbooks.length; i++) {

			// 방어적 코드 작성
			if (phbooks[i] != null) {
				System.out.println(phbooks[i].getUserName() + ", " + phbooks[i].getPhNumber());
			}
		}

	}

	// 선택 조회
	public static void searchByName(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----선택 조회하기-----");
		System.out.println(">>> 이름을 입력해주세요. <<<");
		String phNumber = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks[i] != null) {
				if (phbooks[i].getPhNumber().equals(phNumber)); {
					System.out.println(phbooks[i].getUserName() + ", " + phbooks[i].getPhNumber());
					isFind = true;
					break;
			}
			}

		}
		if (isFind == false) {
			System.out.println("해당 이름의 번호는 존재하지 않습니다.");
		}

	}

	// 삭제
	public static void delete(Scanner sc,PhoneBook[] phbooks) {
		System.out.println("-----번호 삭제하기-----");
		for (int i = 0; i < phbooks.length; i++) {
			phbooks[i] = null;
		}

	}

	// 수정
	public static void update(Scanner sc,PhoneBook[] phbooks) {
		
		System.out.println("이름을 입력해주세요.");
		String qq = sc.nextLine();
		
		System.out.println("수정할 이름을 입력해주세요.");
		String qq1 = sc.nextLine();
		
		System.out.println("수정할 전화번호를 입력해주세요.");
		String qq2 = sc.nextLine();
		
		for(int i=0; i<phbooks.length; i++) {
			if(phbooks !=null && qq.equals(phbooks[i].getUserName())) {
				phbooks[i] = null;
				
				PhoneBook phbooks1 = new PhoneBook(qq1, qq2);
				phbooks[i] = phbooks1;
				return;
			}
		}
	}
	
	
	// 종료

} // end of class
