import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookArrayList;

    public Library(){
        this.bookArrayList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookArrayList.add(book);
    }

    public int getNumberOfBooks() {
        return this.bookArrayList.size();
    }
}
