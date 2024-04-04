
public class Main {

	public static void main(String[] args) {
		String title ="Java Technology";
		double price = 350.00;
Book book = BookManager.createBook(title, price);
BookManager.showBook(book);
}
}