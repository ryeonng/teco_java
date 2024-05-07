package structure;

public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킨다.
	TencoIntArray arrayStack;
	
	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화 (top의 기본 위치)
		arrayStack = new TencoIntArray(); // 칸이 10개인 배열이 생성 됨.
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new TencoIntArray(size);
	}
	
	// 스택의 크기 (요소 갯수) 를 반환
	public int getSize() {
		return top;
	}
	
	// 스택이 비어 있는지 확인하는 메서드
	public boolean isEmpty() {
		return top == 0; // 비어 있으면 true가 반환
	} 
	
	// 스택의 요소가 가득 찼는지 확인 하는 메서드
	public boolean isFull() {
		return top == arrayStack.ARRAY_SIZE; // arrayStack의 최대 사이즈
	}
	
	// 스택의 모든 요소를 출력하는 기능
	public void printAll() {
		arrayStack.printAll();
	}
	
	// 스택에 데이터를 추가하는 기능
	public void push(int data) {
		// 방어적 코드 작성 (메모리가 더 이상 없을 때 발생하는 오버플로우)
		if(isFull()) {
			System.out.println("메모리가 가득 찼습니다.");
			return;
		}
		
		arrayStack.addElement(data);
		top++;
	}
	
	// 스택에서 데이터를 제거하고 반환하는 메서드
	public void pop() {
		if(top == 0) {
			System.out.println("stack is empty");
		}
		System.out.println("Log 1 : " + (top - 1));
		arrayStack.removeElement(top - 1);
		top--;
	}
	
	// 스택의 최상위 요소를 반환하지만, 제거는 하지 않는 기능
	public int peek() {
		if(top == 0) {
			return TencoIntArray.ERROR_NUM;
		}
		
		return arrayStack.getElement(top -1);
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		// 전체 출력
		//stack.printAll();
		stack.pop(); // 버그 발생 → pop의 제거된 요소를 반환할 수 있도록 코드를 수정하라.
		System.out.println("------------------------");
		//stack.printAll();
		System.out.println(stack.peek());
		System.out.println("------------------------");
		stack.printAll();
		
	} // end of main
	
}
