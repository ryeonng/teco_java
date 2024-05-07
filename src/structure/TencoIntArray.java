package structure;

import java.util.Iterator;

/**
 * 배열을 활용한 클래스를 설계하자. 
 * 물론, 이미 자바 표준 API 개발자 들이 잘 만들어 준 클래스들이 존재하지만,
 *  직접 기능을 확장해서 만들어 보자.
 */

public class TencoIntArray {

	int[] intArr; // 배열 선언
	int count; // 배열 안에 들어간 요소의 갯수 관리
	public final int ARRAY_SIZE; // 상수 선언 , 초기화 해 주어야 오류 없음.
	public static final int ERROR_NUM = -999999999;

	public TencoIntArray() {

		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];

	}

	// 생성자 오버로딩
	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
		// ex) size = 100 -> 100칸 배열
	}

	// 기능 설계
	// 배열 요소의 제일 뒤에 값을 추가하는 기능을 가짐
	public void addElement(int inputData) {
		// 방어적 코드 작성 ( 인덱스 길이를 벗어날 경우)
		if (count >= ARRAY_SIZE) {
			System.out.println(" 메모리 공간이 가득찼습니다. ");
			return; // 더 이상 코드 진행이 실행되지않도록 실행의 제어권 반납!
		}

		// intArr[count++] = inputData; // 가능
		intArr[count] = inputData;
		count++; // 증감연산자 사용

	}

	// 지정한 인덱스 번호에 맞는 요소를 출력하는 기능
	public int getElement(int position) { 
		// 배열의 크기는 10 개 , 현재 안에 들어가있는 요소의 갯수는 3개
		// [0] [1] [2]
		
		// 방어적 코드 작성  3 > 3 - 1
		if (position < 0 || position > count - 1) {
			System.out.println(" 검색 위치 오류 ! 현재 리스트의 갯수는 " + count + "개 입니다.");
			return ERROR_NUM;
		} // 아니라면?!
		return intArr[position]; // 사용자가 요청했던 인덱스번호 꺼내주기

	}

	// 요소를 전체출력하는 기능
	public void printAll() {
		// 방어적 코드 작성
		if (count == 0) {
			System.out.println(" 출력할 내용이 없습니다! ");
			return;
		}
		// 요소 하나씩 담고 수행하고 담고 수행하고 반복
		// for (int i : intArr) {
		// System.out.println(intArr[i]);
		// }

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

	// 요소를 전체삭제하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		count = 0; // !! 현재 요소의 갯수 상태가 몇 개인지 항상 관리하고 처리해줘야 한다.
	}

	// 배열의 크기가 아닌 현재 요소의 갯수를 반환하는 기능
	public int getCountSize() {
		return count;
	}

	// 현재 요소가 하나도 없는 상태이다.
	public boolean isEmpty() { // boolean일 때, get메서드를 is로 사용한다.
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}

	// 지정된 인덱스 위치에 값을 추가 하는 기능
	public void insertElement(int position, int inputData) { // (위치 값, 저장 하고자 하는 데이터값)

		// 방어적 코드 작성 1
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득찼습니다.");
			return; // 실행의 제어권 반납
		}
		
		// 방어적 코드 작성 2
		if (position < 0 || ARRAY_SIZE < position) {
			// int 범위를 벗어난 상태!
			System.out.println(" 지정한 인덱스 번호가 잘못되었습니다! ");
			return;
		}
		// 요청값 : position -> 3
		// [11,12,13,14,15] -> 13 [position -> 3] 14
		for (int i = count - 1; i >= position; i--) {
			// 현재 갯수의 -1 부터 시작하게 i 가 설정됨
			intArr[i + 1] = intArr[i];
			// intArr [5] = 15
			// intArr [4] = 14

		}

		intArr[position] = inputData;
		count++;

	}

	// 지정한 인덱스 번호에 요소를 삭제하기!
	public void removeElement(int position) {
		
		// position : 2
		System.out.println(" Log 2 : " + count);
		// 방어적 코드!
		if (isEmpty()) {
			System.out.println("삭제할 요소가 없습니다!");
		}
		// 인덱스 범위를 잘못 지정했을때 방어적 코드!
		if (position < 0 || position >= count) { // || < 또는
			System.out.println(" 잘못된 요청입니다! ");
		}

		//   0          1         2
		// [100] [200] [300]
		
		for (int i = position; i < count - 1; i++) {
			System.out.println(" Log 3 : " + i);
			// 0
			// 0 + 1
			intArr[i] = intArr[i + 1];
		}
		count--;
	}

}