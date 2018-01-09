import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book();
        library = new Library(5);
    }

    @Test
    public void bookAdded(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void getCapacity(){
        assertEquals(5, library.getCapacity());
    }
}
