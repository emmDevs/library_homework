import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("War and Peace", book.getTitle());
    }
}
