package starcraft.ver04;

public class Marine extends Unit {

	
	public Marine(String name) {
		super(name); // 맨 위로 작성해야 문법이 맞음
		super.name = name;
		super.power = 4; 
		super.hp = 70;
	}
	


}
