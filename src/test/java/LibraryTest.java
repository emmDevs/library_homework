import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book warAndPeace;

    @Before
    public void setUp(){
        library = new Library();
        warAndPeace = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction");
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }
}
