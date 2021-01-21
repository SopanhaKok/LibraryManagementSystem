import DatabaseConfig.DatabaseConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Data.Book;

public class Main {

    //read input from keyboard
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


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


}
