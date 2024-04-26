package basic.ch22;

public class Television extends HomeAppliances implements RemoteController {

	//@Override // 추상 메서드를 구현 메서드로 변경

	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}



	
}
