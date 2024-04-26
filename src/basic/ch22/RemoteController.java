package basic.ch22;

public interface RemoteController {

	// interface안에 쓰는 모든 변수 --> public static final (상수가 된다.)
	// interface안에 쓰는 모든 메서드 --> public abstract (추상 메서드가 된다.)
	
	public abstract void trunOn();
	void turnOff(); // 축약 가능
	
}
