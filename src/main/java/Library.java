import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookArrayList;
    int capacity;

    public Library(int capacity){
        this.bookArrayList = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        this.bookArrayList.add(book);
    }

    public int getNumberOfBooks() {
        return this.bookArrayList.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
