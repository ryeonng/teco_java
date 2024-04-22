package basic.ch12;

public class Card {
	
	// 카드 번호가 발급 될 때마다 고유한 카드 번호를
	// 가질 수 있도록 코드를 설계하시오.

	// 멤버 변수, static 변수
	public static int serialNum;
	private int cardNum;
	private String name;
	
	
	// 생성자
	public Card(String name) {
		this.name = name;
		serialNum++;
		cardNum = serialNum;
		
	}
	// 멤버 함수
	
	// get, set 작성
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 코드 테스트 (메인함수)
	public static void main(String[] args) {
		
		System.out.println(Card.serialNum);
		
		Card card1 = new Card("ㅇ");
		System.out.println(card1.getCardNum());
		
		Card card2 = new Card("ㅇㅇ");
		System.out.println(card2.getCardNum());
		
		
	} // end of main
	
} // end of class
