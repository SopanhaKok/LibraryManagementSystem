import DatabaseConfig.DatabaseConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import Data.Book;
import DatabaseManagement.BookAction;

public class Main {

    //read input from keyboard
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BookAction book = new BookAction();

    public static void main(String[] args) throws Exception {
        String option = "";

        do
        {
            System.out.println("===========================================");
            System.out.println("Library Management System");
            System.out.println("===========================================");
            System.out.println("A. List Books");
            System.out.println("B. Add Book");
            System.out.println("C. Update Book");
            System.out.println("D. Delete Book");
            System.out.println("E. Borrow Book");
            System.out.println("F. Show Borrowed Book");
            System.out.println("G. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");
            option = reader.readLine();
            System.out.println("\n");

            switch(option.toUpperCase())
            {
                case "A":
                    ListBooks();
                    break;

                case "B":
                    addBook();
                    break;

                case "C":
                    updateBook();
                    break;

                case "D":
                    deleteBook();
                    break;

                case "E":
                    borrowBook();
                    break;

                case "F":
                    showBorrowedBook();
                    break;

                case "G":
                    System.out.println("******************************THANK YOU********************");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }
        }while(!option.equals("G"));
    }

    public static void ListBooks() throws Exception{
        List<Book> bookList = book.getAllBooks();
        for(Book book: bookList)
        {
            //display book one by one
            displayBook(book);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("\n");

    }

    public static void addBook() throws Exception{

    }

    public static void updateBook() throws Exception{

    }

    public static void deleteBook() throws Exception{

    }

    public static void borrowBook() throws Exception{

    }

    public static void showBorrowedBook() throws Exception{

    }

    public static void displayBook(Book book)
    {
        System.out.println("Book ID: "+book.getBookId());
        System.out.println("Book Name: "+book.getBookName());
        System.out.println("Subject: "+book.getSubject());
        System.out.println("Category: "+book.getCategoryName(book.getCategoryId()));
        System.out.println("\n");
    }


}
