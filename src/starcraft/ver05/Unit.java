package starcraft.ver05;

/**
 * 접근제어지시자
 * public
 * private
 * default
 * protected -- 상속관계에서 설정할 수 있다. 상속받은 객체는 접근 가능하다.
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void beAttacked(int power) {
		// 방어적 코드 작성
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}
	
	
		public void attack(Unit z) { // 다형성 사용
			System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
			z.beAttacked(this.power);
		}

//		@Override  ---> 활용해 재정의 할 수 잇음~
//		public String toString() {
//			// TODO Auto-generated method stub
//			return super.toString();
//		}
	
	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
	
}
