package basic.ch06;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);

	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) { // 횟수 100 번 동작 하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
	}
}
