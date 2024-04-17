package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메서드를 만들어 보세요.
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getPower() {
		return power;
	}
	
	public double getDefense() {
		return defense;
	}
	
	public boolean getIsDie() {
		return isDie;
	}
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	
	public void setDefense(double inputDefense) {
		this.defense = inputDefense;
	}
	
	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}
	
	
	
}
