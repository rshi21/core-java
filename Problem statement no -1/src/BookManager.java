 class BookManager {
public static Book createBook( String title, double price)
{
	return new Book(title, price);
	
}
 public static void showBook ( Book book)
 {
	 System.out.println("Book title: "+ book.getTitle()+ "and Price: "+ book.getPrice());
 }
}
