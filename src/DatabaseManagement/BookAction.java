package DatabaseManagement;

import Data.Book;
import DatabaseConfig.DatabaseConfig;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookAction {
    public List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<Book>();
        try
        {
            //typical jdbc coding
            Connection conn = DatabaseConfig.Connection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while(rs.next())
            {
                Book book = new Book(rs.getInt("book_id"), rs.getString("book_name"), rs.getString("subject"), rs.getInt("category_ID"));
                bookList.add(book);
            }
            DatabaseConfig.closeConnection(conn);  //close connection
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return bookList;
    }
}
