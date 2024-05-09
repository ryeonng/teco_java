package structure.ch04;

import java.util.LinkedList;

public class MyLinkedList {

	private Node head; // 요소의 맨 처음을 가리킴
	private int count; // Linked list 에 몇 개의 요소가 연결되어 있는지 개수

	// MyLinkedList 맨 처음 생성 시, node는 없는 상태.
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 저장된 Node의 개수를 반환하는 메서드
	public int getCount() {
		return count;
	}

	// 새로운 노드(Node)를 1개 추가하는 메서드
	public Node addElement(String data) {
		Node createNode = new Node(data);

		if (head == null) {
			// 맨 처음 요소를 저장하는 동작
			head = createNode;
		} else {

			// 항상 요소 찾기는 linked list 의 head 부터 시작
			Node preNode = head; // [빵또아][](next)

			while (preNode.next != null) {
				preNode = preNode.next;
			}
			// 핵심 코드

			preNode.next = createNode;

		}
		count++;
		return createNode; // 오류방지 - 추후에 수정
	}

	public Node removeElement(int index) {
		// 방어적 코드 작성
		// 0 , 1
		if (index >= count) {
			System.out.println("삭제할 위치 오류. 현재 리스트 개수는 " + count + "입니다.");
			return null;
		}

		// 맨 앞 요소를 삭제 요청 시
		// 항상 요소를 찾을 때 시작은 head 부터 시작.
		Node tempNode = head;
		if (index == 0) {
			// [빵또아][가료이.주소값] → [가료이][null]
			head = tempNode.next;
			// 코드 수행 후 모습
			// [가료이][null]
		} else {
			// 코드 시작 전 모습 : position → 2라 가정 → n - 1 → [1]
			// [빵또아][가료이.주소값] → [가료이][도아.주소값] → [도아][null]
			Node preNode = null;
			for (int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;

		} // end of if
		count--;
//		System.out.println(position + " 번 째 요소를 삭제 했습니다.");
		return tempNode; // 추후 수정
	}

	// 전체 출력 기능
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print(" → ");
			}
		}
		System.out.println();
	}

	// 지정한 위치에 노드 하나만 출력 하기
	public Node getNodeByIndex(int index) {
		// 방어적 코드
		if (index >= count) {
			System.out.println("검색 위치 오류 - 잘못된 요청입니다.");
		}

		Node tempNode = head;
		if (index == 0) {
			return head;
		}

		// [빵또아][가료이.주소값] → [가료이][] → [도아][]
		for (int i = 0; i < index; i++) {
			tempNode = tempNode.next; // 다음 요소는 무조건 next에 담겨 있다.
		}

		return tempNode;
	}

	// 전체 삭제 기능
	public void removeAll() {
		head = null;
		count = 0;
	}

	// 테스트 코드
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("빵또아");
		linkedList.addElement("가료이");
		linkedList.addElement("도아");
		linkedList.addElement("가령");
		linkedList.addElement("하리보");

		linkedList.printAll();
		linkedList.removeElement(2); // N번 째 요소 삭제
		linkedList.printAll();
		System.out.println(linkedList.getNodeByIndex(1).getData()); // N번 째 위치 노드만 출력
		// [빵또아][] → [가료이] [] → [도아][]
		//      ↑ head
//		System.out.println(linkedList.getCount());
		linkedList.removeAll(); // 전체 삭제
		linkedList.printAll();

	} // end of main

} // end of class
