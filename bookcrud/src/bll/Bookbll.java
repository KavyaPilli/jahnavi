package bll;
import java.util.List;
import dto.Book;
import java.sql.SQLException;
public interface Bookbll {
	  public List<Book> listAllBooks();
	  public Book getBook(int id);
	  public void deleteBook(int id);
	  public void updateBook(Book book);
	  public void addBook(Book book) throws SQLException;

}
