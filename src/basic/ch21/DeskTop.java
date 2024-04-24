package basic.ch21;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("화면에 표시됩니다.");
	}

	@Override
	public void typing() {
		System.out.println("타자를 작성합니다.");
	}

}
