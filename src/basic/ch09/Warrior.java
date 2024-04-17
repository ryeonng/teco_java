package basic.ch09;

public class Warrior {

	String name;
	int level;
	int health;
	int attack;

	public Warrior(String userName, int userLevel, int userHealth, int userAttack) {
		name = userName;
		level = userLevel;
		health = userHealth;
		attack = userAttack;
	}

	public void levelUp(int grow) {
		level += grow;
		System.out.println(grow + "레벨 업");
	}
	
	public void attack(int a) {
		attack += a;
		System.out.println("공격");
		for(int i =1; i <= a; i++) {
			System.out.println("공격");
		}
		System.out.println("공격하였습니다");
	}

} // end of class
