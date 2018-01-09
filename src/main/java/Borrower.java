import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    Book book;

    public Borrower(){
        this.bookCollection = new ArrayList<>();
    }

    public void addBook(){
        this.bookCollection.add(book);
    }

    public void borrowBook(Library library){
        addBook(library.removeBook());
    }
}
