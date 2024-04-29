package useful.ch03;

public class NickName {

	private String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws NickNameException {
		if (nick == null) {
			System.out.println("닉네임을 입력하세요");
		} 
		if (nick.length() < 3) {
			System.out.println("닉네임은 3자 이상이어야 합니다.");
		}
		if (nick.matches("[a-zA-Z]+")) {
			throw new NickNameException("닉네임은 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.nick = nick;
		
	}
	
}
