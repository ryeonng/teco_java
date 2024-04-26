package basic.ch22;

public class AnimalTest {

	public static void main(String[] args) {

		// Animal animal = new Animal(); 인터페이스는 기본으로 new 할수없다.
		Animal dog = new Dog(); // dog 는 animal 로 바라볼수 있다. (다형성적용됨)(업캐스팅된상태)
		Animal bird = new Bird();

		dog.eat();
		dog.move();

		bird.eat();
		bird.move();

	}//

}//