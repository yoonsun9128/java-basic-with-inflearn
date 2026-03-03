package construct.ex;

public class BookMain {
	public static void main(String[] args) {

		Book book1 = new Book();
		book1.displayInfo();

		Book book2 = new Book("Hello java", "yoon");
		book2.displayInfo();

		Book book3 = new Book("jpa 프록래밍", "choi", 700);
		book3.displayInfo();
	}
}
