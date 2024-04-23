package starcraft.ver02;

public class GateWay {
	
	private int gateWayNumber;
	private int count;

	// 생성자 
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getGateWayNumber() {
		return gateWayNumber;
	}
	
	
	// 기능 - 질럿 생산하는 기능
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}

}
