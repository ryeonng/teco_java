package useful.ch04;

public class WarriorTest {

	public static void main(String[] args) {

		// Warrior 객체에 접근
		
		// A 클래스에서 활용
		Warrior warrior = Warrior.getInstance();
		System.out.println(warrior);
		
		// B 클래스에서 활용
		Warrior warrior2 = Warrior.getInstance();
		System.out.println(warrior2);
	}

}
