package basic.ch22;

interface Animal {
	// 클래스가 아니라 interface가 됨 > 추상 메서드만 선언가능.
	// public abstract void eat();
	// public abstract void move();

	// 어짜피 추상메서드만 가능하기에, 문법적으로 축약 가능함.
	void eat();

	void move();

}

// implements - 구현하다 
class Dog implements Animal { // Dog 에 오류가 뜸 . 오류 눌러서 add 하면됨

	@Override
	public void eat() {
		System.out.println("먹이를 먹다");
	}

	@Override
	public void move() {
		System.out.println("총총 다닌다");
	}

}

class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("모이를 먹다");
	}

	@Override
	public void move() {
		System.out.println("날아 다닌다");
	}

}
