package Data;
import DatabaseConfig.DatabaseConfig;
import DatabaseManagement.CategoryAction;
import Data.Category;

public class Book {
    private int bookId;
    private String bookName;
    private String subject;
    private int categoryId;

    //default constructor
    public Book(){

    }

    //constructor
    public Book(int bookId,String bookName,String subject,int categoryId){
        this.bookId = bookId;
        this.bookName = bookName;
        this.subject = subject;
        this.categoryId = categoryId;
    }

    //getter and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName(int categoryId){
        CategoryAction getData = new CategoryAction();
        Category category = getData.getCategoryById(categoryId);
        return category.getCategoryName();
    }

    @Override
    public String toString(){
        CategoryAction getData = new CategoryAction();
        Category category = getData.getCategoryById(categoryId);
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", subject=" + subject + ", category=" + category.getCategoryName() + "]";
    }


}
