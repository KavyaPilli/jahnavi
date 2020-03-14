package bookmain;
import dto.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.util.List;
import dao.BookDao;
import dto.Book;


public class TestBook {

	public static void main(String[] args) throws SQLException{

		BookDao bdao=new BookDao("jdbc:mysql://localhost:3306/cts","root","root");
		bdao.connect();
		Book book=new Book(1009,"Data Science","mathews",5650);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice");
		
		System.out.println("=========================CRUD operations=====================");
		System.out.println("1.Insert Book");
		System.out.println("2.Update Book");
		System.out.println("3.Delete Book");
		System.out.println("4.Show All Book");
		System.out.println("5.exit");
		

		while(true)
		{
			System.out.println("Enter ur choice");
			int ch=s.nextInt();
		switch(ch)
		{
		case 1: bdao.insertBook(book);
				System.out.println("Book Inserted");
				break;
		case 2: bdao.updateBook(book);
		        System.out.println("Book Updated");
		        break;
		case 3: bdao.deleteBook(book);
        		System.out.println("Book deleted");
        		break;        
		case 4: List<Book> books=bdao.listAllBooks();
		        for(Book b:books)
		        {
		        System.out.println(b.getTitle()+" "+b.getAuthor());
		        }
		        break;
		case 5: System.exit(0);
		default:System.out.println("Enter a avlid option");
		        break;
		}
		}
	}

}
