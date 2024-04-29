package useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickname = new NickName();
		String inputnick = null;
		inputnick = "asdf";
		
		try {
			nickname.setNick(inputnick);
		} catch (NickNameException e) {
			System.out.println("정의한 nickname 예외 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 :" + e.getMessage());
		}
		
		
	} // end of main

} // end of class
