package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("야스오", 100); // warrior1 : 참조변수
		Archer archer1 = new Archer("애쉬", 100);
		Wizard wizard1 = new Wizard("라이즈", 100);
		
		warrior1.attack();
		
		
	} // end of main

} // end of class
