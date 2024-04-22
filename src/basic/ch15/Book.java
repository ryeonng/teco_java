package basic.ch15;

public class Book {

	private int totalPage;
	private String title;
	private String author;
	
	// 생성자 
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 생성자 오버로딩
	public Book(String title, String author, int totalPage) {
		this(title, author); // -> 생성자에 생성자 들고올 때
		this.totalPage = totalPage;
	}
	
	// getter 메서드
	public int getTotalPage() {
		return totalPage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void showInfo() {
		System.out.println(">>> 책 정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}
	
	
}
