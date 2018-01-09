import org.junit.Before;
import org.junit.Test;

public class TestLibrary {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book();
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
    }
}
